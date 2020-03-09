package com.codewithmosh.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  // public int count(){
  //   return products.size();
  // }

  // Product get(int index){
  //   return products.get(index);
  // }

  public Iterator<Product> createIterator(){
    return new ListIterator(this);
  }
  /**
   * ListIterator
   */
  public class ListIterator implements Iterator<Product> {
  
    ProductCollection productCollection;

    public ListIterator(ProductCollection productCollection) {
      this.productCollection = productCollection;
    }

    int index = 0;
    @Override
    public boolean hasNext(){
      return index < productCollection.products.size();
    }
    @Override
    public Product current(){
      return productCollection.products.get(index);
    }
    @Override
    public void next (){
      index++;
    }
  } 
}
