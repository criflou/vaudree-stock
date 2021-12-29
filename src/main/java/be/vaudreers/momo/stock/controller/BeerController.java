package be.vaudreers.momo.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import be.vaudreers.momo.stock.domain.Beer;
import be.vaudreers.momo.stock.repository.BeerRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path="/vaudree")
public class BeerController {
	
	@Autowired
	private BeerRepository beerRepository;
	
	 @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewBeer (
			              @RequestParam String name,
	                      @RequestParam String brasserie,
	                      @RequestParam String volume, 
	                      @RequestParam int stock, 
	                      @RequestParam String codeVidange,
	                      @RequestParam String abv,
	                      @RequestParam double groupPrice,
	                      @RequestParam double toDefine,
	                      @RequestParam double brasserieSellPrice,
	                      @RequestParam double unitBuyPrice,
	                      @RequestParam String Category,
	                      @RequestParam String subCategory,
	                      @RequestParam double storePrice) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    Beer b = new Beer();
	    b.setName(name);
	    b.setBrasserie(brasserie);
	    b.setVolume(volume);
	    b.setStock(stock);
	    b.setCodeVidange(codeVidange);
	    b.setAbv(abv);
	    b.setGroupPrice(groupPrice);
	    b.setToDefine(toDefine);
	    b.setBrasserieSellPrice(brasserieSellPrice);
	    b.setUnitBuyPrice(unitBuyPrice);
	    b.setCategory(Category);
	    b.setSubCategory(subCategory);
	    b.setStorePrice(storePrice);
	    	  
	    beerRepository.save(b);
	    return "Saved";
	  }
	 
	 @GetMapping(path="/all")
	  public @ResponseBody Iterable<Beer> getAllBeers() {
	    
	    return beerRepository.findAll();
	    
	  }

}
