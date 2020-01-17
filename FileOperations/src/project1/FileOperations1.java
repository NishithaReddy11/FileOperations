package project1;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileOperations1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		//	Files.list(Paths.get(".")).filter(s->s.toString().endsWith(".txt")).forEach(System.out::println);
//			Files.lines(Paths.get("hello.txt"))
//			.filter(s->s.toString().length()>15)
//			.map(String::toUpperCase)
//			.forEach(System.out::println);
//			Files.lines(Paths.get("hello.txt"))
//			.filter(s->(s.toString().split(" ")).length>=2)
//			.map(String::toUpperCase)
//			.forEach(System.out::println);
			List<String> lines=Files.lines(Paths.get("hello.txt"))
			.filter(s->s.toString().length()>15)
			.map(String::toUpperCase)
			.collect(Collectors.toList());
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
