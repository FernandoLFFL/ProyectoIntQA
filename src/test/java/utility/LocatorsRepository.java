package utility;

public class LocatorsRepository {
	
	//Sección de oferta 3 days
	private String offerSection="[src=\"http://automationpractice.com/modules/themeconfigurator/img/banner-img6.jpg\"]";
	
	//Foto portada
	private String coverPhoto="[src=\"http://automationpractice.com/modules/blockbanner/img/sale70.png\"]"; 
	
	//Opcion de vestidos 
	private String linkDresses= "//*[@id=\'block_top_menu\']/ul/li[2]/a"; 
	
	//Link de casual dresses 
	private String linkCasualDresses="Casual Dresses";
	
	//Contenedor del vestido 
	private String dressContainer = "//img[@title='Printed Dress' and @src='http://automationpractice.com/img/p/8/8-home_default.jpg']";
	
	//Boton agregar vestido 
	private String dressButton = "//div/a[@href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=3&token=e817bb0705dd58da8db074c69f729fd8']";
	
	//Ir al carrito Css Selector
	private String checkOut="[title='Proceed to checkout']";
	
	//Opcion de T-Shirts 
	private String linkTshirts="//*[@id=\"block_top_menu\"]/ul/li[3]/a"; 
	
	//Verificar que está el carrito 
	private String cart="cart_summary";
	
	//Contenedor playera
	private String tShirtContainer = "//img[@title='Faded Short Sleeve T-shirts' and @src='http://automationpractice.com/img/p/1/1-home_default.jpg']";
	
	//Boton agregar playera
	private String tShirtButton = "//div/a[@href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=1&token=e817bb0705dd58da8db074c69f729fd8']";
		
	//Verificar item 2 by Id
	private String productId="product_1_1_0_0";
	
	//Campo para buscar 
	private String txtSearch="search_query_top"; 
	
	//Boton buscar 
	private String searchButton="[name='submit_search']"; 
	
	//Opción Contact Us
	private String contactButton="[title='Contact us']"; 
	
	//Url página de contacto
	private String contactUrl = "http://automationpractice.com/index.php?controller=contact"; 
	
	public String getCoverPhoto() {
		return coverPhoto;
	}


	public String getOfferSection() {
		return offerSection;
	}
	
	
	public String getLinkDresses() {
		return linkDresses;
	}
	
	public String getLinkCasualDresses() {
		return linkCasualDresses;
	}


	public String getDressContainer() {
		return dressContainer;
	}

	public String getDressButton() {
		return dressButton;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public String getCart() {
		return cart;
	}


	public String getLinkTshirts() {
		return linkTshirts;
	}

	public String gettShirtContainer() {
		return tShirtContainer;
	}

	public String gettShirtButton() {
		return tShirtButton;
	}

	public String getProductId() {
		return productId;
	}

	public String getTxtSearch() {
		return txtSearch;
	}

	public String getSearchButton() {
		return searchButton;
	}

	public String getContactButton() {
		return contactButton;
	}

	public String getContactUrl() {
		return contactUrl;
	}	
	
	
				
	
}
