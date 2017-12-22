package po;

import java.util.List;

public class Favorite {
	int user_id;
	List<Integer> post_id;
	
	Favorite(){}
	Favorite(int user_id,List<Integer> post_id){
		this.user_id=user_id;
		this.post_id=post_id;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public List<Integer> getPost_id() {
		return post_id;
	}
	public void setPost_id(List<Integer> post_id) {
		this.post_id = post_id;
	}
	

}
