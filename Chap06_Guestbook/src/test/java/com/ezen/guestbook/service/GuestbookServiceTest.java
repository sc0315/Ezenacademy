package com.ezen.guestbook.service;

//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//import com.ezen.guestbook.dto.GuestbookDTO;
//import com.ezen.guestbook.dto.PageRequestDTO;
//import com.ezen.guestbook.dto.PageResultDTO;
//import com.ezen.guestbook.entity.Guestbook;

@SpringBootTest
public class GuestbookServiceTest {
	
//	@Autowired
//    private GuestbookService service;
	
//	 @Disabled
//	@Test
//   public void testRegister() {
//
//       GuestbookDTO guestbookDTO = GuestbookDTO.builder()
//               .title("샘플 제목...")
//               .content("샘플 내용...")
//               .writer("user0")
//               .build();
//
//       System.out.println(service.register(guestbookDTO));
//   }
	
//	@Disabled
//	@Test
//    public void testList() {
//
//        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().page(1).size(10).build();
//
//        PageResultDTO<GuestbookDTO, Guestbook> resultDTO = service.getList(pageRequestDTO);
//
//        for(GuestbookDTO guestbookDTO : resultDTO.getDtoList()) {
//            System.out.println(guestbookDTO);
//        }
//    }

//	@Disabled
//	@Test
//    public void testList() {
//
//        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().page(1).size(10).build();
//
//        PageResultDTO<GuestbookDTO, Guestbook> resultDTO = service.getList(pageRequestDTO);
//
//        System.out.println(resultDTO.isPrev());
//        System.out.println(resultDTO.isNext());
//        System.out.println(resultDTO.getTotalPage());
//        System.out.println("-------------------------");
//        for(GuestbookDTO guestbookDTO : resultDTO.getDtoList()) {
//            System.out.println(guestbookDTO);
//        }
//        System.out.println("-------------------------");
//        resultDTO.getPageList().forEach(i -> System.out.println(i));
//
//    }
	
//	@Disabled
//	@Test
//    public void testSearch() {
//        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
//                .page(1)
//                .size(10)
//                .type("tc")
//                .keyword("3")
//                .build();
//
//        PageResultDTO<GuestbookDTO, Guestbook> resultDTO = service.getList(pageRequestDTO);
//
//        System.out.println("PREV: " + resultDTO.isPrev());
//        System.out.println("NEXT: " + resultDTO.isNext());
//        System.out.println("TOTAL: " + resultDTO.getTotalPage());
//
//        System.out.println("-------------------------");
//        for (GuestbookDTO guestbookDTO : resultDTO.getDtoList()) {
//            System.out.println(guestbookDTO);
//        }
//
//        System.out.println("========================");
//        resultDTO.getPageList().forEach(i -> System.out.println(i));
//    }
	

}
