package com.springcompany.biz.paging;

public class PagingVO {
	//현재페이지, 페이지 시작게시글, 페이지 끝게시글, 게시글 총 개수, 페이지당 글 개수, 마지막 페이지, SQL쿼리에 쓸 start,end
	private int nowPage;
	private int startPage;
	private int endPage;
	private int total;
	private int cntPerPage;
	private int lastPage;
	private int cntPage = 5;
	
	public PagingVO(int total, int nowPage, int cntPerPage) {
		System.out.println("cntPerPage : "+cntPerPage);
		System.out.println("tatal : "+total);
		System.out.println("nowPage : "+nowPage);
		
		setCntPerPage(cntPerPage);
	 	setNowPage(nowPage);
		setTotal(total);
		
		calcLastPage(getTotal());
		calcStartEndPage(getNowPage(), cntPage);
	}

	//제일 마지막 페이지 계산
	//*
	public void calcLastPage(int total) {
		//setLastPage((int)Math.ceil((double)total/(double)cntPerPage));
		
		System.out.println("total : "+total+"     cntPerPage : "+getCntPerPage());
		setLastPage((int)((double)total/getCntPerPage()+0.95));
	}
	//*/
	//시작, 끝 페이지 계산
	public void calcStartEndPage(int nowPage, int cntPage) {
		setEndPage(((int)Math.ceil((double)nowPage / (double)cntPage)) * cntPage);
		if(getLastPage()<getEndPage()) {
			setEndPage(getLastPage());
		}
		setStartPage(getEndPage() - cntPage+1);
		if(getStartPage()<1) {
			setStartPage(1);
		}
	}
	
	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCntPerPage() {
		return cntPerPage;
	}

	public void setCntPerPage(int cntPerPage) {
		this.cntPerPage = cntPerPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	
	public int getCntPage() {
		return cntPage;
	}

	public void setCntPage(int cntPage) {
		this.cntPage = cntPage;
	}
	@Override
	public String toString() {
		return "PagingVO [nowPage=" + nowPage + ", startPage=" + startPage + ", endPage=" + endPage + ", total=" + total
				+ ", cntPerPage=" + cntPerPage + ", lastPage=" + lastPage
				+ ", cntPage=" + cntPage + "]";
	}
	
}
