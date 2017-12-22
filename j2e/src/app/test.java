package app;

import java.util.List;

import dao.FavoriteDAO;

public class test {
	public static void main(String args[]){
		FavoriteDAO dao=new FavoriteDAO();
		String hql="from fa";
		dao.findByHql(hql);
	}

}
