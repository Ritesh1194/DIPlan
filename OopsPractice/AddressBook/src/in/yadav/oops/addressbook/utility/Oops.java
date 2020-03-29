package in.yadav.oops.addressbook.utility;

/** *****************************************************************************
 *	  Purpose: OOPS Utility class.
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  29-03-2020
 *
 ***************************************************************************** */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Oops {
	static ObjectMapper objectMapper = new ObjectMapper();

	/**
	 * Define static function readJsonFile()
	 * 
	 * @param fileName
	 *            --> String
	 * @return String
	 */
	public static String readJsonFile(String filename) throws IOException {
		FileReader fileReader = new FileReader(filename);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String str = "";
		String line = "";
		while ((line = bufferedReader.readLine()) != null) {
			str += line;
		}
		bufferedReader.close();
		return str;
	}

	/**
	 * Define static function writeFile()
	 * 
	 * @param json
	 *            --> String
	 * @param fileName
	 *            --> String
	 * @return void
	 */

	public static void writeFile(String json, String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json);
		bw.close();
	}

	public static void writeFile1(JSONObject json, String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		fw.write(json.toJSONString());
		fw.flush();
		fw.close();
	}

	/**
	 * Define static function userWriteValueString()
	 * 
	 * @param list
	 *            --> <T> Generic Type
	 * @return <T> String
	 */

	public static <T> String userWriteValueAsString(List<T> list) throws JsonMappingException, IOException {
		return objectMapper.writeValueAsString(list);
	}

	/**
	 * Define static function writeToFile()
	 * 
	 * @param list
	 *            --> <T> Generic Type
	 * @param fileName
	 *            --> String
	 * @return <T> void
	 */
	// public static <T> void writeToFile(String filename, List<T> list) throws
	// JsonMappingException, IOException {
	// String jsonString = userWriteValueAsString(list);
	// writeFile(jsonString, filename);
	// }

	/**
	 * Define static function userReadValue()
	 * 
	 * @param clazz
	 *            --> <> Generic Type
	 * @param str
	 *            --> String
	 * @return <T> List
	 */
	public static <T> List userReadValue(String str, Class<?> clazz) throws JsonMappingException, IOException {
		CollectionType colletion = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);
		return objectMapper.readValue(str, colletion);
	}

	/**
	 * Define static function getDate()
	 * 
	 * @return String
	 */
	public static String getDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		return date;
	}

	public static JSONObject readFile1(String fileName) {
		JSONObject object = new JSONObject();
		FileReader reader;
		try {
			reader = new FileReader(fileName);

			JSONParser parser = new JSONParser();
			object = (JSONObject) parser.parse(reader);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;

	}
}