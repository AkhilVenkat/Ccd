package com.lwl.ccd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lwl.ccd.util.PrimeFactorsUtil;

@SpringBootApplication
public class CcdApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CcdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (args.length > 0) {
			try {
				int num = Integer.parseInt(args[0]);
				String str = PrimeFactorsUtil.primeFactorsAsString(num);
				System.out.println(str);
			} catch (Exception e) {
				System.out.println("Invalid input is given:" + e);
			}
		}

	}

}
