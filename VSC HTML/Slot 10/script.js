// Script file for Liberty Electronics website

// A sample array of products for each brand
var products = {
    Samsung: [
        {name:"Samsung Galaxy S23 Ultra", image:"images/samsung1.png", features:"6.8-inch display, 200MP camera, 12GB RAM, 5000mAh battery", doc:"docs/samsung1.doc"},
        {name:"Samsung Galaxy Tab S8", image:"images/samsung2.png", features:"11-inch display, 13MP camera, 8GB RAM, 8000mAh battery", doc:"docs/samsung2.doc"},
        {name:"Samsung Galaxy Watch 4", image:"images/samsung3.png", features:"1.5-inch display, heart rate monitor, 2GB RAM, 425mAh battery", doc:"docs/samsung3.doc"}
    ],
    Apple: [
        {name:"iPhone 14 Pro Max", image:"images/apple1.png", features:"6.7-inch display, 48MP camera, 6GB RAM, 4323mAh battery", doc:"docs/apple1.doc"},
        {name:"iPad Pro", image:"images/apple2.png", features:"11-inch display, 12MP camera, 8GB RAM, 7538mAh battery", doc:"docs/apple2.doc"},
        {name:"Apple Watch Series 8", image:"images/apple3.png", features:"1.9-inch display, heart rate monitor, 1GB RAM, 308mAh battery", doc:"docs/apple3.doc"}
    ],
    Xiaomi: [
        {name:"Xiaomi 13", image:"images/xiaomi1.png", features:"6.36-inch display, 50MP camera, 8GB RAM, 4500mAh battery", doc:"docs/xiaomi1.doc"},
        {name:"Xiaomi Pad 6", image:"images/xiaomi2.png", features:"11-inch display, 13MP camera, 6GB RAM, 8840mAh battery", doc:"docs/xiaomi2.doc"},
        {name:"Xiaomi Watch S1 Active", image:"images/xiaomi3.png", features:"1.43-inch display, heart rate monitor, 1GB RAM, 470mAh battery", doc: "docs/sony3.doc"}
      ]
  };
  
// Keep track of the previously clicked brand
var previousBrand = null;

function showProducts(brand) {
    // Get the products element
    var productsElement = document.getElementById("products");
    // Clear the previous content
    productsElement.innerHTML = "";
    // Get the array of products for the brand
    var brandProducts = products[brand];
    // Loop through the array and create HTML elements for each product
    for (var i = 0; i < brandProducts.length; i++) {
        // Create a div element for the product
        var productDiv = document.createElement("div");
        productDiv.className = "product";
        // Create an img element for the product image
        var productImg = document.createElement("img");
        productImg.src = brandProducts[i].image;
        productImg.alt = brandProducts[i].name;
        // Create a h3 element for the product name
        var productName = document.createElement("h3");
        productName.textContent = brandProducts[i].name;
        // Create a p element for the product features
        var productFeatures = document.createElement("p");
        productFeatures.textContent = brandProducts[i].features;
        // Create an a element for the product document
        var productDoc = document.createElement("a");
        productDoc.href = brandProducts[i].doc;
        productDoc.textContent = "Download specifications";
        // Append the elements to the product div
        productDiv.appendChild(productImg);
        productDiv.appendChild(productName);
        productDiv.appendChild(productFeatures);
        productDiv.appendChild(productDoc);
        // Append the product div to the products element
        productsElement.appendChild(productDiv);
    }
    var brandLogoImage = document.querySelector(".brands img[alt='" + brand + "']");
    if (brandLogoImage) {
      if (previousBrand) {
          // Change the previous brand's logo back to its original
          var previousBrandLogoImage = document.querySelector(".brands img[alt='" + previousBrand + "']");
          if (previousBrandLogoImage) {
              previousBrandLogoImage.src = "images/" + previousBrand + "Logo.png";
          }
      }
      // Change the current brand's logo and update previousBrand
      brandLogoImage.src = "images/" + brand + "Logo2.png";
      previousBrand = brand;
    }
}