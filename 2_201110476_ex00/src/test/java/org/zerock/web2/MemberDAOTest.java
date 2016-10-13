package org.zerock.web2;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVO;
import org.zerock.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime()throws Exception{
		
		System.out.println(dao.getTime());
		
	}
	
	@Test
	public void testInsertMember()throws Exception{
		
		MemberVO vo = new MemberVO();
		vo.setUserid("user01");
		vo.setUserpw("user01");
		vo.setUsername("USER01");
		vo.setEmail("user01@aaa.com");
		
		dao.insertMember(vo);
		
	}	

	@Test
	public void testreadMerber()throws Exception{
		
		System.out.println(dao.readMember("user00"));
	}	
	
	@Test
	public void testreadWithPW()throws Exception{
		
		System.out.println(dao.readWithPW("uesr00", "uesr00"));
		
	}
}


