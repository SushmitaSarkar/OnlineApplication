package com.onlineShoppingApp.OnlineShopping.service;

import com.onlineShoppingApp.OnlineShopping.Exception.InvalidUsernameException;
import com.onlineShoppingApp.OnlineShopping.Exception.ProductDoesNotExistException;
import com.onlineShoppingApp.OnlineShopping.model.AddProduct;
import com.onlineShoppingApp.OnlineShopping.model.User;
import com.onlineShoppingApp.OnlineShopping.repository.ProductDao;
import com.onlineShoppingApp.OnlineShopping.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyFloat;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class ProductServiceTest {

	@InjectMocks
	ProductService productService;

	@Mock
	UserRepository userRepository;

	@InjectMocks
	UserService userService;
	@Mock
	ProductDao productRepository;

	//@Mock
	//DeleteProducer deleteProducer;

	AddProduct product;
	List<AddProduct> productList = new ArrayList<AddProduct>();

	/**
	 * Method under test: {@link ProductService#addNewProduct(String, AddProduct)}
	 */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddNewProduct() throws InvalidUsernameException {
		// TODO: Complete this test.
		//   Reason: R013 No inputs found that don't throw a trivial exception.
		//   Diffblue Cover tried to run the arrange/act section, but the method under
		//   test threw
		//   java.lang.NullPointerException
		//       at com.onlineShoppingApp.OnlineShopping.service.ProductService.addNewProduct(ProductService.java:43)
		//   See https://diff.blue/R013 to resolve this issue.

		ProductService productService = new ProductService();

		AddProduct addProduct = new AddProduct();
		addProduct.setFeatures("Features");
		addProduct.setPrice(10.0f);
		addProduct.setProductDescription("Product Description");
		addProduct.setProductId("42");
		addProduct.setProductName("Product Name");
		addProduct.setProductQuantity(1);
		addProduct.setProductStatus("Product Status");
		productService.addNewProduct("janedoe", addProduct);
    }

    /**
     * Method under test: {@link ProductService#addNewProduct(String, AddProduct)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddNewProduct2() throws InvalidUsernameException {
		// TODO: Complete this test.
		//   Reason: R013 No inputs found that don't throw a trivial exception.
		//   Diffblue Cover tried to run the arrange/act section, but the method under
		//   test threw
		//   java.lang.NullPointerException
		//       at com.onlineShoppingApp.OnlineShopping.service.ProductService.addNewProduct(ProductService.java:43)
		//   See https://diff.blue/R013 to resolve this issue.

		ProductService productService = new ProductService();
		AddProduct addProduct = mock(AddProduct.class);
		doNothing().when(addProduct).setFeatures((String) any());
		doNothing().when(addProduct).setPrice(anyFloat());
		doNothing().when(addProduct).setProductDescription((String) any());
		doNothing().when(addProduct).setProductId((String) any());
		doNothing().when(addProduct).setProductName((String) any());
		doNothing().when(addProduct).setProductQuantity(anyInt());
		doNothing().when(addProduct).setProductStatus((String) any());
		addProduct.setFeatures("Features");
		addProduct.setPrice(10.0f);
		addProduct.setProductDescription("Product Description");
		addProduct.setProductId("42");
		addProduct.setProductName("Product Name");
		addProduct.setProductQuantity(1);
		addProduct.setProductStatus("Product Status");
		productService.addNewProduct("janedoe", addProduct);
    }

    @BeforeEach
	void beforeEach() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testGetAllProduct() {
		product = new AddProduct();
		productList.add(product);
		doReturn(productList).when(productRepository).findAll();
		assertEquals(productList, productService.getAllProduct());
	}
//	@Test
//	void testGetUserProductThrowsException() throws InvalidUsernameException {
//		assertThrows(InvalidUsernameException.class, () -> productService.get("", ""));
//	}

	/**
	 * Method under test: {@link ProductService#getAllProduct()}
	 */
	@Test
	@Disabled("TODO: Complete this test")
	void testGetAllProduct2() {
		// TODO: Complete this test.
		//   Reason: R013 No inputs found that don't throw a trivial exception.
		//   Diffblue Cover tried to run the arrange/act section, but the method under
		//   test threw
		//   java.lang.NullPointerException
		//       at com.onlineShoppingApp.OnlineShopping.service.ProductService.getAllProduct(ProductService.java:57)
		//   See https://diff.blue/R013 to resolve this issue.

		(new ProductService()).getAllProduct();
	}

    /**
     * Method under test: {@link ProductService#getProductByName(String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetProductByName() throws InvalidUsernameException {
		//   Diffblue Cover was unable to write a Spring test,
		//   so wrote a non-Spring test instead.
		//   Reason: R013 No inputs found that don't throw a trivial exception.
		//   Diffblue Cover tried to run the arrange/act section, but the method under
		//   test threw
		//   java.lang.IncompatibleClassChangeError
		//       at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:93)
		//       at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
		//       at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:38)
		//       at org.mockito.internal.creation.cglib.MethodInterceptorFilter.intercept(MethodInterceptorFilter.java:59)
		//       at com.onlineShoppingApp.OnlineShopping.repository.ProductDao$$EnhancerByMockitoWithCGLIB$$eaad1b97.findByProductName(<generated>)
		//       at com.onlineShoppingApp.OnlineShopping.service.ProductService.getProductByName(ProductService.java:64)
		//   See https://diff.blue/R013 to resolve this issue.

		// TODO: Complete this test.
		//   Reason: R013 No inputs found that don't throw a trivial exception.
		//   Diffblue Cover tried to run the arrange/act section, but the method under
		//   test threw
		//   java.lang.NullPointerException
		//       at com.onlineShoppingApp.OnlineShopping.service.ProductService.getProductByName(ProductService.java:64)
		//   See https://diff.blue/R013 to resolve this issue.

		(new ProductService()).getProductByName("Productname", "Logged In User");
    }

    /**
     * Method under test: {@link ProductService#getProductByName(String, String)}
     */
    @Test
    void testGetProductByName2() throws InvalidUsernameException {
		//   Diffblue Cover was unable to write a Spring test,
		//   so wrote a non-Spring test instead.
		//   Reason: R013 No inputs found that don't throw a trivial exception.
		//   Diffblue Cover tried to run the arrange/act section, but the method under
		//   test threw
		//   java.lang.IncompatibleClassChangeError
		//       at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:93)
		//       at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
		//       at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:38)
		//       at org.mockito.internal.creation.cglib.MethodInterceptorFilter.intercept(MethodInterceptorFilter.java:59)
		//       at com.onlineShoppingApp.OnlineShopping.repository.ProductDao$$EnhancerByMockitoWithCGLIB$$eaad1b97.findByProductName(<generated>)
		//       at com.onlineShoppingApp.OnlineShopping.service.ProductService.getProductByName(ProductService.java:64)
		//   See https://diff.blue/R013 to resolve this issue.

		assertThrows(InvalidUsernameException.class, () -> (new ProductService()).getProductByName(null, "foo"));
    }

    /**
     * Method under test: {@link ProductService#getProductByName(String, String)}
     */
    @Test
    void testGetProductByName3() throws InvalidUsernameException {
		//   Diffblue Cover was unable to write a Spring test,
		//   so wrote a non-Spring test instead.
		//   Reason: R013 No inputs found that don't throw a trivial exception.
		//   Diffblue Cover tried to run the arrange/act section, but the method under
		//   test threw
		//   java.lang.IncompatibleClassChangeError
		//       at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:93)
		//       at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
		//       at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:38)
		//       at org.mockito.internal.creation.cglib.MethodInterceptorFilter.intercept(MethodInterceptorFilter.java:59)
		//       at com.onlineShoppingApp.OnlineShopping.repository.ProductDao$$EnhancerByMockitoWithCGLIB$$eaad1b97.findByProductName(<generated>)
		//       at com.onlineShoppingApp.OnlineShopping.service.ProductService.getProductByName(ProductService.java:64)
		//   See https://diff.blue/R013 to resolve this issue.

		assertThrows(InvalidUsernameException.class, () -> (new ProductService()).getProductByName("", "foo"));
    }

    /**
     * Method under test: {@link ProductService#updateProduct(String, String, AddProduct, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateProduct() throws InvalidUsernameException, ProductDoesNotExistException {
		// TODO: Complete this test.
		//   Reason: R013 No inputs found that don't throw a trivial exception.
		//   Diffblue Cover tried to run the arrange/act section, but the method under
		//   test threw
		//   java.lang.NullPointerException
		//       at com.onlineShoppingApp.OnlineShopping.service.ProductService.updateProduct(ProductService.java:78)
		//   See https://diff.blue/R013 to resolve this issue.

		ProductService productService = new ProductService();

		AddProduct addProduct = new AddProduct();
		addProduct.setFeatures("Features");
		addProduct.setPrice(10.0f);
		addProduct.setProductDescription("Product Description");
		addProduct.setProductId("42");
		addProduct.setProductName("Product Name");
		addProduct.setProductQuantity(1);
		addProduct.setProductStatus("Product Status");
		productService.updateProduct("Productname", "42", addProduct, "Logged In User");
    }

    /**
     * Method under test: {@link ProductService#updateProduct(String, String, AddProduct, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateProduct2() throws InvalidUsernameException, ProductDoesNotExistException {
		// TODO: Complete this test.
		//   Reason: R013 No inputs found that don't throw a trivial exception.
		//   Diffblue Cover tried to run the arrange/act section, but the method under
		//   test threw
		//   java.lang.NullPointerException
		//       at com.onlineShoppingApp.OnlineShopping.service.ProductService.updateProduct(ProductService.java:78)
		//   See https://diff.blue/R013 to resolve this issue.

		ProductService productService = new ProductService();
		AddProduct addProduct = mock(AddProduct.class);
		doNothing().when(addProduct).setFeatures((String) any());
		doNothing().when(addProduct).setPrice(anyFloat());
		doNothing().when(addProduct).setProductDescription((String) any());
		doNothing().when(addProduct).setProductId((String) any());
		doNothing().when(addProduct).setProductName((String) any());
		doNothing().when(addProduct).setProductQuantity(anyInt());
		doNothing().when(addProduct).setProductStatus((String) any());
		addProduct.setFeatures("Features");
		addProduct.setPrice(10.0f);
		addProduct.setProductDescription("Product Description");
		addProduct.setProductId("42");
		addProduct.setProductName("Product Name");
		addProduct.setProductQuantity(1);
		addProduct.setProductStatus("Product Status");
		productService.updateProduct("Productname", "42", addProduct, "Logged In User");
    }

	/**
	 * Method under test: {@link ProductService#deleteProduct(String)}
	 */
	@Test
	@Disabled("TODO: Complete this test")
	void testDeleteProduct() throws ProductDoesNotExistException {
		// TODO: Complete this test.
		//   Reason: R013 No inputs found that don't throw a trivial exception.
		//   Diffblue Cover tried to run the arrange/act section, but the method under
		//   test threw
		//   java.lang.NullPointerException
		//       at com.onlineShoppingApp.OnlineShopping.service.ProductService.deleteProduct(ProductService.java:122)
		//   See https://diff.blue/R013 to resolve this issue.

		(new ProductService()).deleteProduct("42");
	}

	@Test
	void testPostProduct() throws InvalidUsernameException {
		User user = new User(" ", "Sushmita", "Sarkar", "sush@gmail.com", "abc", "abc", "+91-76890523", "sush789", "Admin");
		product = new AddProduct("1234", "laptop", "Lenevo", 24590, "laptop", "HURRY UP TO PURCHASE", 2);
		doReturn(user).when(userRepository).insert(user);
		doReturn(product).when(productRepository).insert(product);
		//assertEquals("laptop",productService.addNewProduct(user.getUserName(),product).getProductName());0
		assertThat(product).isEqualTo(productService.addNewProduct(user.getUserName(), product));

	}

	User user;
	List<User> users = new ArrayList<User>();

	@Test
	void testGetAllUser() {
		user = new User();
		users.add(user);
		doReturn(users).when(userRepository).findAll();
		List<User> allUser = userService.getAllUsers();
		assertThat(allUser).isNotEqualTo(users);
	}

}
