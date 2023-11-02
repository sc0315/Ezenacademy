package com.ezen.guestbook.repository;

//import java.util.Optional;
//import java.util.stream.IntStream;
//
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;

//import com.ezen.guestbook.dto.GuestbookDTO;
//import com.ezen.guestbook.dto.PageRequestDTO;
//import com.ezen.guestbook.dto.PageResultDTO;
//import com.ezen.guestbook.entity.Guestbook;
//import com.ezen.guestbook.entity.QGuestbook;
//import com.ezen.guestbook.service.GuestbookService;
//import com.querydsl.core.BooleanBuilder;
//import com.querydsl.core.types.dsl.BooleanExpression;

@SpringBootTest
public class GuestbookRepositoryTest {
	
//	@Autowired
//	private GuestbookRepository guestbookRepository;
	
	 
	 
//	@Disabled
//	@Test
//	public void insertData() {
//		IntStream.rangeClosed(1, 300).forEach(i -> {
//			GuestBook guestBook = GuestBook.builder()
//					.title("Title..." + i)
//					.content("Content..." + i)
//					.writer("user"+(i % 10))
//					.build();
//				System.out.println(guestbookRepository.save(guestBook));
//		});
//	}
	
//	@Disabled
//	@Test
//	public void updateTest() {
//		Optional<GuestBook> result = guestbookRepository.findById(300L); // 값이 없으면 null pointer 예외 생겨서 오류나기때문에 optional 타입으로 해야함 
//		
//		if (result.isPresent()) {
//			GuestBook guestBook = result.get();
//			guestBook.changeTitle("수정된 제목...");
//			guestBook.changeContent("수정된 내용...");
//			
//			guestbookRepository.save(guestBook);
//		}
//	}
	
//	@Disabled
//	@Test
//	public void testQuerydsl() {
//		// 1. Q 도메인 클래스의 객체 생성
//		QGuestBook qGuestbook = QGuestBook.guestBook;
//		
//		// WHERE 절에 들어가는 조건을 만들기 위해 BooleanBuilder 객체 생성
//		BooleanBuilder builder = new BooleanBuilder();
//		// 추가할 조건식 생성
//		String keyword = "1";
//		BooleanExpression expression = qGuestbook.title.contains(keyword);
//		
//		//만들어진 조건을 and 나 or 조건을 사용하여 결합
//		builder.and(expression);
//		
//		Pageable pageable = PageRequest.of(0, 10, Sort.by("gno").descending());
//		
//		// findAll() - QuerydslPredicateExecutor 인터페이스의 메소드
//		Page<GuestBook> result = guestbookRepository.findAll(builder, pageable);
//		
//		// 결과 출력
//		result.stream().forEach(guestbook -> {
//			System.out.println(guestbook);
//		});
//	}
	
//	@Disabled
//	@Test
//    public void testQuery2() {
//       
//        QGuestBook qGuestbook = QGuestBook.guestBook;
//
//        String keyword = "1";
//        
//        BooleanBuilder builder = new BooleanBuilder();
//       
//        BooleanExpression exTitle = qGuestbook.title.contains(keyword);
//       
//        BooleanExpression exContent = qGuestbook.content.contains(keyword);
//
//        BooleanExpression exAll = exTitle.or(exContent);
//
//        builder.and(exAll);
//
//        builder.and(qGuestbook.gno.gt(0L));
//        
//        Pageable pageable = PageRequest.of(0, 10, Sort.by("gno").descending());
//        Page<GuestBook> result = guestbookRepository.findAll(builder, pageable);
//        
//        result.stream().forEach(guestbook -> {
//            System.out.println(guestbook);
//        });
//    }
	

}
