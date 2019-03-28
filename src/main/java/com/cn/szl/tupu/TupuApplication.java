package com.cn.szl.tupu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;

@EnableCaching
@SpringBootApplication
@MapperScan(basePackages = "com.cn.szl.tupu.dao")
@EnableTransactionManagement
public class TupuApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(TupuApplication.class, args);


//		ServerSocket serverSocket = new ServerSocket(1000);
//		Socket socket = serverSocket.accept();
//		InputStream in = socket.getInputStream();
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
//		String info = null;
//		while ((info=br.readLine())!=null){
//			System.out.println("客户端向您发送了"+info);
//		}
//		socket.shutdownInput();
//
//		OutputStream os = socket.getOutputStream();
//		PrintWriter pw = new PrintWriter(os);
//		pw.write("欢迎你");
//		pw.flush();


	}
}
