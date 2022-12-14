package dao;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.Review;

public class ReviewDao {
	
	// 싱글턴 객체 생성
	private static ReviewDao instance = new ReviewDao();
	
	// 유일한 생성자 private으로 객체생성 막음
	private ReviewDao() {
	}
	
	// 싱글턴 객체 얻기(부르기)
	public static ReviewDao getInstance() {
		return instance;
	}
	
	// mybatis 사용할 객체
	private static SqlSession session;
	
	static {	// 클래스 초기화 블럭
		try {
			Reader reader = Resources.getResourceAsReader("configuration.xml");
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
			session = ssf.openSession(true);
		}catch (Exception e) {
			System.out.println("초기화 에러 " + e.getMessage());
		}
	}

	// 특정 회원이 작성한 리뷰 읽어오기
	public List<Review> memberReviewList(int memberno) {
		return session.selectList("reviewns.memberReviewList", memberno);
	}

	// 리뷰 등록
	public int insertRv(Review review) {
		return session.insert("reviewns.insertRv", review);
	}
	
	// 특정 영화에 대한 리뷰 전체 불러오기
	public List<Review> reviewList(int movieno) {
		return session.selectList("reviewns.reviewList", movieno);
	}
	
	// 리뷰 삭제
	public int reviewDel(int reviewno) {
		return session.delete("reviewns.reviewDel", reviewno);
	}
	
	// 리뷰 수정시 1개 불러오기
	public Review reviewShow(int reviewno) {
		return (Review) session.selectOne("reviewns.reviewShow", reviewno);
	}
	
	// 리뷰 수정
	public int reviewUpdate(Review review) {
		return session.update("reviewns.reviewUpdate", review);
	}
	// 특정회원의 총 리뷰 수 페이징용
	public int total(int memberno) {
		return (int) session.selectOne("reviewns.getTotal",memberno);
	}

	public List<Review> memberListPage(int startRow, int endRow, int memberno) {
		Map<String, Integer> map = new HashMap<>();
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		map.put("memberno", memberno);
		return session.selectList("reviewns.memberListPage", map);
	}

	public int totalMvRv(int movieno) {
		return (int) session.selectOne("reviewns.totalMvRv", movieno);
	}

	public List<Review> rvList(int startRow, int endRow, int movieno) {
		Map<String, Integer> map = new HashMap<>();
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		map.put("movieno", movieno);
		return session.selectList("reviewns.rvList", map);
	}

	// 해당 영화 리뷰들의 평균 점수
	public float avgScore(int movieno) {
		return (float) session.selectOne("reviewns.avgScore", movieno);
	}
	
}
