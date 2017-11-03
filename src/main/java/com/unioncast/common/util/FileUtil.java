package com.unioncast.common.util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * 文件的常用读写操作
 * 
 * @author liutiejun
 * @date 2016年3月18日 下午4:22:42
 *
 */
public final class FileUtil {

	private static final String UTF_8 = "UTF-8";

	private FileUtil() {
	}

	/**
	 * 将一行数据写入txt文件，文件名根据日期自动生成，默认使用UTF-8编码
	 * 
	 * @param line
	 */
	public static void write(String line) {
		write(System.currentTimeMillis() + ".txt", line);
	}

	/**
	 * 将一行数据写入txt文件，默认使用UTF-8编码
	 * 
	 * @param fileName
	 *            ：文件名
	 * @param line
	 *            ：要写入的数据
	 */
	public static void write(String fileName, String line) {
		write(fileName, line, UTF_8);
	}

	/**
	 * 将一行数据写入txt文件
	 * 
	 * @param fileName
	 *            ：文件名
	 * @param line
	 *            ：要写入的数据
	 * @param charset
	 *            ：文件编码
	 */
	public static void write(String fileName, String line, String charset) {
		write(fileName, line, charset, false);
	}

	/**
	 * 将一行数据写入txt文件，默认使用UTF-8编码
	 * 
	 * @param file
	 *            ：要写入数据的文件
	 * @param line
	 *            ：要写入的数据
	 */
	public static void write(File file, String line) {
		write(file, line, UTF_8);
	}

	/**
	 * 将一行数据写入txt文件
	 * 
	 * @param file
	 *            ：要写入数据的文件
	 * @param line
	 *            ：要写入的数据
	 * @param charset
	 *            ：文件编码
	 */
	public static void write(File file, String line, String charset) {
		write(file, line, charset, false);
	}

	/**
	 * 写入文件
	 * 
	 * @param list
	 */
	public static <T> void write(List<T> list) {
		write(System.currentTimeMillis() + ".txt", list);
	}

	/**
	 * 写入文件
	 * 
	 * @param fileName
	 * @param list
	 */
	public static <T> void write(String fileName, List<T> list) {
		write(fileName, list, UTF_8);
	}

	/**
	 * 写入文件
	 * 
	 * @param fileName
	 * @param list
	 * @param charset
	 */
	public static <T> void write(String fileName, List<T> list, String charset) {
		write(fileName, list, charset, false);
	}

	/**
	 * 写入文件
	 * 
	 * @param file
	 * @param list
	 */
	public static <T> void write(File file, List<T> list) {
		write(file, list, UTF_8);
	}

	/**
	 * 写入文件
	 * 
	 * @param file
	 * @param list
	 * @param charset
	 */
	public static <T> void write(File file, List<T> list, String charset) {
		write(file, list, charset, false);
	}

	/**
	 * 写入文件
	 * 
	 * @param fileName
	 * @param line
	 * @param charset
	 * @param append
	 */
	public static void write(String fileName, String line, String charset, boolean append) {
		if (!StringUtils.isEmpty(fileName)) {
			write(new File(fileName), line, charset, append);
		}
	}

	/**
	 * 写入文件
	 * 
	 * @param file
	 * @param line
	 * @param charset
	 * @param append
	 */
	public static void write(File file, String line, String charset, boolean append) {
		if (file == null || StringUtils.isEmpty(line)) {
			return;
		}

		try (PrintWriter writer = getWriter(file, charset, append)) {
			writer.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 写入文件
	 * 
	 * @param fileName
	 * @param list
	 * @param charset
	 * @param append
	 */
	public static <T> void write(String fileName, List<T> list, String charset, boolean append) {
		if (!StringUtils.isEmpty(fileName)) {
			write(new File(fileName), list, charset, append);
		}
	}

	/**
	 * 写入文件
	 * 
	 * @param <T>
	 * @param file
	 *            ：要写入数据的文件
	 * @param list
	 *            ：要写入文件的数据，是一个集合，其中每一个元素占用一行
	 * @param charset
	 *            ：文件编码
	 * @param append
	 *            ：true不覆盖文件中原来的内容，false覆盖文件总原来的内容
	 */
	public static <T> void write(File file, List<T> list, String charset, boolean append) {
		if (file == null) {
			return;
		}

		try (PrintWriter writer = getWriter(file, charset, append)) {
			if (!CollectionUtils.isEmpty(list)) {
				for (T e : list) {
					writer.println(e);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static <K, V> void write(Map<K, V> map) {
		write(System.currentTimeMillis() + ".txt", map);
	}

	/**
	 * 将一个Map里面的数据输入到文本文件中，一条记录为一行，key和value之间用“\t”隔开
	 * 
	 * @param fileName
	 * @param map
	 */
	public static <K, V> void write(String fileName, Map<K, V> map) {
		write(fileName, map, UTF_8);
	}

	/**
	 * 将一个Map里面的数据输入到文本文件中，一条记录为一行，key和value之间用“\t”隔开
	 * 
	 * @param fileName
	 * @param map
	 * @param charset
	 */
	public static <K, V> void write(String fileName, Map<K, V> map, String charset) {
		write(new File(fileName), map, charset, false);
	}

	/**
	 * 将一个Map里面的数据输入到文本文件中，一条记录为一行，key和value之间用“\t”隔开
	 * 
	 * @param fileName
	 * @param map
	 * @param charset
	 * @param append
	 */
	public static <K, V> void write(String fileName, Map<K, V> map, String charset, boolean append) {
		write(new File(fileName), map, charset, append);
	}

	/**
	 * 将一个Map里面的数据输入到文本文件中，一条记录为一行，key和value之间用“\t”隔开
	 * 
	 * @param file
	 * @param map
	 * @param charset
	 * @param append
	 */
	public static <K, V> void write(File file, Map<K, V> map, String charset, boolean append) {
		if (file == null) {
			return;
		}

		try (PrintWriter writer = getWriter(file, charset, append)) {
			if (!MapUtils.isEmpty(map)) {
				for (Map.Entry<K, V> me : map.entrySet()) {
					writer.println(me.getKey() + "\t" + me.getValue());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writeResource(String fileName) {

	}

	public static void writeResource(String fileName, String charset) {

	}

	/**
	 * 可以用来实现文件的复制
	 * 
	 * @author liutiejun
	 * @date 2015年6月26日 下午4:05:34
	 *
	 * @param fileData
	 *            ：文件内容对应的字节数组
	 * @param fileName
	 *            ：新文件
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void write(byte[] fileData, String fileName) throws FileNotFoundException, IOException {
		write(fileData, new File(fileName));
	}

	/**
	 * 可以用来实现文件的复制
	 * 
	 * @author liutiejun
	 * @date 2015年6月26日 上午10:55:02
	 *
	 * @param fileData
	 *            ：文件内容对应的字节数组
	 * @param file
	 *            ：新文件
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void write(byte[] fileData, File file) throws FileNotFoundException, IOException {
		try (BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file))) {
			output.write(fileData);
		}
	}

	/**
	 * 使用PrintWriter进行文件的写入
	 * 
	 * @param file
	 * @param charset
	 * @param append
	 * @return
	 * @throws Exception
	 */
	private static PrintWriter getWriter(File file, String charset, boolean append) throws Exception {
		PrintWriter writer = null;

		if (StringUtils.isEmpty(charset)) {
			writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, append))));
		} else {
			writer = new PrintWriter(
					new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, append), charset)));
		}

		return writer;
	}

	/**
	 * 读取txt文件中的内容，一行一条记录，默认为UTF-8编码，读取的是系统根目录下面的数据
	 * 
	 * @param filePath
	 * @return
	 */
	public static List<String> read(String filePath) {
		return read(filePath, UTF_8);
	}

	public static List<String> read(String filePath, String charset) {
		return read(new File(filePath), charset);
	}

	public static String readFile(String filePath, String charset) {
		List<String> list = readResources(filePath, charset);
		StringBuilder sb = new StringBuilder();
		for (String s : list) {
			sb.append(s);
		}
		return sb.toString();
	}

	public static List<String> read(File file) {
		return read(file, UTF_8);
	}

	public static List<String> read(File file, String charset) {
		if (file == null) {
			return null;
		}

		try (BufferedReader reader = getReader(file, charset)) {
			return read(reader);
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 读取资源文件，以src为根目录进行查找
	 * 
	 * @author liutiejun
	 * @date 2013-11-13 上午11:59:40
	 * @param fileName
	 * @return
	 */
	public static List<String> readResources(String fileName) {
		return readResources(fileName, UTF_8);
	}

	/**
	 * 读取资源文件，以src为根目录进行查找
	 * 
	 * @author liutiejun
	 * @date 2015-3-2 下午3:21:17
	 * 
	 * @param fileName
	 * @param charset
	 * @return
	 */
	public static List<String> readResources(String fileName, String charset) {
		List<String> list = null;
		if (StringUtils.isEmpty(fileName)) {
			return null;
		}

		try (BufferedReader reader = getResourceReader(fileName, charset)) {
			
			list =  read(reader);
			reader.close();
			return list;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			
		}

		return null;
	}

	private static List<String> read(BufferedReader reader) throws IOException {
		List<String> result = new ArrayList<String>();

		String line = null;
		while ((line = reader.readLine()) != null) {
			result.add(line);
		}

		return result;
	}

	/**
	 * 使用BufferedReader进行txt文件的读取
	 * 
	 * @author liutiejun
	 * @date 2013-12-19 上午11:47:23
	 * @param file
	 * @param charset
	 * @return
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 */
	public static BufferedReader getReader(File file, String charset)
			throws FileNotFoundException, UnsupportedEncodingException {
		BufferedReader reader = null;

		if (StringUtils.isEmpty(charset)) {// 使用系统默认编码
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		} else {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
		}

		return reader;
	}

	/**
	 * 用来读取资源文件
	 * 
	 * @author liutiejun
	 * @date 2015-3-2 下午3:20:32
	 * 
	 * @param fileName
	 * @param charset
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static BufferedReader getResourceReader(String fileName, String charset)
			throws UnsupportedEncodingException {
		BufferedReader reader = null;

		// InputStream inputStream =
		// ClassLoader.getSystemResourceAsStream(fileName);
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);

		if (StringUtils.isEmpty(charset)) {// 使用系统默认编码
			reader = new BufferedReader(new InputStreamReader(inputStream));
		} else {
			reader = new BufferedReader(new InputStreamReader(inputStream, charset));
		}

		return reader;
	}

	/**
	 * txt文件中的数据以key-value的形式保持，其中key和value之间用“=”或者“:”隔开
	 * 
	 * @param fileName
	 * @return
	 */
	public static Map<String, String> readMap(String fileName) {
		return readMap(fileName, UTF_8);
	}

	/**
	 * txt文件中的数据以key-value的形式保持，其中key和value之间用“=”或者“:”隔开
	 * 
	 * @param fileName
	 * @param charset
	 * @return
	 */
	public static Map<String, String> readMap(String fileName, String charset) {
		return readMap(new File(fileName), charset);
	}

	/**
	 * txt文件中的数据以key-value的形式保持，其中key和value之间用“=”或者“:”隔开
	 * 
	 * @param file
	 * @param charset
	 * @return
	 */
	public static Map<String, String> readMap(File file, String charset) {
		if (file == null) {
			return null;
		}

		try (BufferedReader reader = getReader(file, charset)) {
			return readMap(reader);
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 读取资源文件,读取的是src/main/resources中的资源文件
	 * 
	 * @param fileName
	 * @return
	 */
	public static Map<String, String> readMapResources(String fileName) {
		return readMapResources(fileName, UTF_8);
	}

	/**
	 * 读取资源文件,读取的是src/main/resources中的资源文件
	 * 
	 * @param fileName
	 * @param charset
	 * @return
	 */
	public static Map<String, String> readMapResources(String fileName, String charset) {
		if (StringUtils.isEmpty(fileName)) {
			return null;
		}

		try (BufferedReader reader = getResourceReader(fileName, charset)) {
			return readMap(reader);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	private static Map<String, String> readMap(BufferedReader reader) throws IOException {
		Map<String, String> result = new HashMap<String, String>();

		String line = null;
		while ((line = reader.readLine()) != null) {
			if (line.startsWith("#")) { // zn add
				continue;
			}
			String[] array = line.split("[\\s]*[=|:|\t][\\s]*", 2); // zn add \t
			result.put(array[0], array[1]);
		}

		return result;
	}

	/**
	 * 读取一个properties配置文件中的数据，数据是以key-value的形式出现 如果key为中文的话会出现乱码
	 * 
	 * @author liutiejun
	 * @date 2015-3-2 下午3:13:58
	 * 
	 * @param fileName
	 * @return
	 */
	public static Properties readProperties(String fileName) {
		Properties info = new Properties();

		try (InputStream inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName)) {
			info.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return info;
	}

	/**
	 * 读取一个properties配置文件中的数据，数据是以key-value的形式出现 配置文件是在项目外的文件夹中
	 * 
	 * @author chengyunyun
	 * @date 2013-10-24
	 * @param fileName
	 * @return
	 */
	public static Properties readFile(String fileName) {
		Properties info = new Properties();

		try (InputStream inStream = new FileInputStream(fileName)) {
			info.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError(e);
		}

		return info;
	}

	/**
	 * 创建不存在的文件夹，并创建所有的子文件夹
	 * 
	 * @param filePath
	 */
	public static void makeDir(String filePath) {
		makeDir(filePath, true);
	}

	/**
	 * 创建不存在的文件夹，并创建所有的子文件夹
	 * 
	 * @author liutiejun
	 * @date 2014-1-15 下午2:56:33
	 * @param filePath
	 * @param isDirectory
	 *            ：false这是一个标准文件，最后一级是文件名
	 */
	public static void makeDir(String filePath, boolean isDirectory) {
		if (StringUtils.isEmpty(filePath)) {
			return;
		}

		String[] filePathArray = filePath.split("\\\\|/");

		int len = filePathArray.length;
		if (!isDirectory) {// 最后一级不是Directory而是标准的File
			len--;
		}

		StringBuilder dirPath = new StringBuilder();
		for (int i = 0; i < len; i++) {
			dirPath.append(filePathArray[i]).append("/");

			File dir = new File(dirPath.toString());
			if (!dir.exists()) {
				dir.mkdir();
			}
		}
	}

	/**
	 * Returns the size of the specified file or directory. If the provided {@link File} is a regular file, then the
	 * file's length is returned. If the argument is a directory, then the size of the directory is calculated
	 * recursively. If a directory or subdirectory is security restricted, its size will not be included.
	 * 
	 * @param file
	 *            the regular file or directory to return the size of (must not be {@code null}).
	 * 
	 * @return the length of the file, or recursive size of the directory, provided (in bytes).
	 * 
	 * @throws NullPointerException
	 *             if the file is {@code null}
	 * @throws IllegalArgumentException
	 *             if the file does not exist.
	 * 
	 * @since 2.0
	 */
	public static long sizeOf(File file) {
		if (!file.exists()) {
			String message = file + " does not exist";
			throw new IllegalArgumentException(message);
		}

		if (file.isDirectory()) {
			return sizeOfDirectory(file);
		} else {
			return file.length();
		}

	}

	/**
	 * Returns the size of the specified file or directory. If the provided {@link File} is a regular file, then the
	 * file's length is returned. If the argument is a directory, then the size of the directory is calculated
	 * recursively. If a directory or subdirectory is security restricted, its size will not be included.
	 * 
	 * @param file
	 *            the regular file or directory to return the size of (must not be {@code null}).
	 * 
	 * @return the length of the file, or recursive size of the directory, provided (in bytes).
	 * 
	 * @throws NullPointerException
	 *             if the file is {@code null}
	 * @throws IllegalArgumentException
	 *             if the file does not exist.
	 * 
	 * @since 2.4
	 */
	public static BigInteger sizeOfAsBigInteger(File file) {
		if (!file.exists()) {
			String message = file + " does not exist";
			throw new IllegalArgumentException(message);
		}

		if (file.isDirectory()) {
			return sizeOfDirectoryAsBigInteger(file);
		} else {
			return BigInteger.valueOf(file.length());
		}

	}

	/**
	 * Counts the size of a directory recursively (sum of the length of all files).
	 * 
	 * @param directory
	 *            directory to inspect, must not be {@code null}
	 * @return size of directory in bytes, 0 if directory is security restricted, a negative number when the real total
	 *         is greater than {@link Long#MAX_VALUE}.
	 * @throws NullPointerException
	 *             if the directory is {@code null}
	 */
	public static long sizeOfDirectory(File directory) {
		checkDirectory(directory);

		final File[] files = directory.listFiles();
		if (files == null) { // null if security restricted
			return 0L;
		}
		long size = 0;

		for (final File file : files) {
			size += sizeOf(file);
			if (size < 0) {
				break;
			}
		}

		return size;
	}

	/**
	 * Counts the size of a directory recursively (sum of the length of all files).
	 * 
	 * @param directory
	 *            directory to inspect, must not be {@code null}
	 * @return size of directory in bytes, 0 if directory is security restricted.
	 * @throws NullPointerException
	 *             if the directory is {@code null}
	 * @since 2.4
	 */
	public static BigInteger sizeOfDirectoryAsBigInteger(File directory) {
		checkDirectory(directory);

		final File[] files = directory.listFiles();
		if (files == null) { // null if security restricted
			return BigInteger.ZERO;
		}
		BigInteger size = BigInteger.ZERO;

		for (final File file : files) {
			size = size.add(BigInteger.valueOf(sizeOf(file)));
		}

		return size;
	}

	/**
	 * Checks that the given {@code File} exists and is a directory.
	 * 
	 * @param directory
	 *            The {@code File} to check.
	 * @throws IllegalArgumentException
	 *             if the given {@code File} does not exist or is not a directory.
	 */
	private static void checkDirectory(File directory) {
		if (!directory.exists()) {
			throw new IllegalArgumentException(directory + " does not exist");
		}

		if (!directory.isDirectory()) {
			throw new IllegalArgumentException(directory + " is not a directory");
		}
	}

	/**
	 * 显示目录下面的所有文件，包含子目录下面的文件
	 * 
	 * @param dir
	 * @return
	 */
	public static List<File> listFiles(File dir) {
		if (dir == null || !dir.exists() || !dir.isDirectory()) {
			return null;
		}

		List<File> fileList = new ArrayList<File>();
		File[] files = dir.listFiles();
		for (File f : files) {
			if (f.isDirectory()) {
				fileList.addAll(listFiles(f));
			} else {
				fileList.add(f);
			}
		}

		return fileList;
	}

	/**
	 * 计算文本文件中一共有多少行
	 * 
	 * @param file
	 * @return
	 */
	public static Integer getFileLineCount(String file) {
		if (file == null) {
			return 0;
		}

		int lineCount = 0;

		try (BufferedReader reader = getReader(new File(file), null)) {
			while (reader.readLine() != null) {
				lineCount++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lineCount;
	}

	/**
	 * 获得文件名 如filePath：file:/D:/eclipse_workspace/search-resys/TopicTrainData/1.txt 返回文件名：1
	 * 
	 * @param filePath
	 * @return
	 */
	public static String getFileName(String filePath) {
		if (StringUtils.isEmpty(filePath)) {
			return null;
		}

		char[] chars = filePath.toCharArray();

		int beginIndex = -1;
		int endIndex = -1;

		for (int i = chars.length - 1; i >= 0; i--) {
			if (chars[i] == '.') {
				if (endIndex == -1) {
					endIndex = i;
				}
			} else if (chars[i] == '/' || chars[i] == '\\') {
				beginIndex = i + 1;
				break;
			}
		}

		if (beginIndex == -1) {
			beginIndex = 0;
		}

		return filePath.substring(beginIndex, endIndex);
	}

	public static void delete(String fileName) {
		File file = new File(fileName);
		if (file.exists()) {
			file.delete();
		}
	}

	/**
	 * 按照文件的最后修改时间排序
	 * 
	 * @author liutiejun
	 * @date 2014-12-18 上午10:08:57
	 * 
	 * @param files
	 * @param reverse
	 *            ：true降序，false升序
	 */
	public static void sortByLastModified(File[] files, final boolean reverse) {
		if (ArrayUtils.isEmpty(files) || files.length == 1) {
			return;
		}

		Arrays.sort(files, new Comparator<File>() {
			@Override
			public int compare(File f1, File f2) {
				int result = 0;

				if (f1.lastModified() > f2.lastModified()) {
					result = 1;
				} else if (f1.lastModified() < f2.lastModified()) {
					result = -1;
				}

				if (reverse) {
					result *= -1;
				}

				return result;
			}
		});
	}

	/**
	 * 获得文件内容对应的字节数组
	 * 
	 * @author liutiejun
	 * @date 2015年6月26日 上午11:10:55
	 *
	 * @param file
	 * @return
	 */
	public static byte[] getBytes(File file) {
		if (file == null || !file.exists()) {
			return null;
		}

		try (FileInputStream input = new FileInputStream(file)) {
			byte[] fileData = new byte[(int) file.length()];

			input.read(fileData);

			return fileData;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 将一个目录下的所有数据复制到另外一个目录下，并保持相同的目录层次结构
	 * 
	 * @author liutiejun
	 * @date 2015年7月27日 下午3:53:35
	 *
	 * @param sourceDirPath
	 * @param targetDirPath
	 * @throws IOException
	 */
	public static void copyDir(String sourceDirPath, String targetDirPath) throws IOException {
		File sourceDir = new File(sourceDirPath);
		File targetDir = new File(targetDirPath);

		if (!sourceDir.exists()) {
			throw new FileNotFoundException("sourceDir does not exist: " + sourceDirPath);
		}

		if (!targetDir.exists()) {
			throw new FileNotFoundException("targetDir does not exist: " + targetDirPath);
		}

		if (!sourceDir.isDirectory()) {
			throw new IOException("sourceDir is not a directory: " + sourceDirPath);
		}

		if (!targetDir.isDirectory()) {
			throw new IOException("targetDir is not a directory: " + targetDirPath);
		}

		copyDirToDir(sourceDirPath, targetDirPath, sourceDir);
	}

	private static void copyDirToDir(String sourceDirPath, String targetDirPath, File sourceDir) throws IOException {
		File[] files = sourceDir.listFiles();
		if (ArrayUtils.isEmpty(files)) {
			File targetDir = new File(targetDirPath, sourceDir.getAbsolutePath().substring(sourceDirPath.length()));

			makeDir(targetDir.getAbsolutePath());

			return;
		}

		for (File f : files) {
			if (f.isFile()) {
				copyFileToDir(sourceDirPath, targetDirPath, f);
			} else {
				copyDirToDir(sourceDirPath, targetDirPath, f);
			}
		}

	}

	private static void copyFileToDir(String sourceDirPath, String targetDirPath, File sourceFile) throws IOException {
		String filePath = sourceFile.getAbsolutePath();

		File targetFile = new File(targetDirPath, filePath.substring(sourceDirPath.length()));

		makeDir(targetFile.getAbsolutePath(), false);

		try (InputStream input = new FileInputStream(sourceFile);
				OutputStream output = new FileOutputStream(targetFile);) {
			IOUtils.copy(input, output);
		}

	}

	/**
	 * 下载文件
	 * 
	 * @author liutiejun
	 * @date 2015年11月16日 下午4:08:20
	 *
	 * @param requestUri
	 * @param parentDir
	 * @param filePath
	 * @param out
	 * @throws IOException
	 */
	public static void download(String requestUri, String parentDir, String filePath, OutputStream out)
			throws IOException {
		File downloadFile = null;

		if (StringUtils.isNotBlank(parentDir)) {
			downloadFile = new File(parentDir, filePath);
		} else {
			downloadFile = new File(filePath);
		}

		download(requestUri, downloadFile, out);
	}

	public static void download(String requestUri, String filePath, OutputStream out) throws IOException {
		download(requestUri, null, filePath, out);
	}

	/**
	 * 下载文件
	 * 
	 * @author liutiejun
	 * @date 2015年11月16日 下午4:08:10
	 *
	 * @param requestUri
	 * @param downloadFile
	 * @param out
	 * @throws IOException
	 */
	public static void download(String requestUri, File downloadFile, OutputStream out) throws IOException {
		try (FileInputStream fis = new FileInputStream(downloadFile);) {

			byte[] b = new byte[fis.available()];
			fis.read(b);

			out.write(b);
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new FileNotFoundException("File Not Found: " + requestUri);
		} catch (IOException e) {
			throw e;
		}

	}

}
