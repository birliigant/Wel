package com.sipc.welgame;

import com.sipc.welgame.pojo.domain.Answer.Product;
import com.sipc.welgame.utils.AnswersUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WelGameApplicationTests {

	@Test
	void contextLoads() {
		String s = " 威胁  ，劣势,机会， 优  ";

		boolean b = AnswersUtil.verifyAnswerOne(Product.PRODUCT_ANSWER_TWO, s);
		System.out.println(b);

	}

}
