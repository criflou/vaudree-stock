package be.vaudreers.momo.stock.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Beer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;	
	String name;
	String brasserie;
	String volume;
	int stock;
	String codeVidange;
	String abv;
	double groupPrice;
	double toDefine;
	double brasserieSellPrice;
	double unitBuyPrice;
	String Category;
	String subCategory;
	double storePrice;	

}
