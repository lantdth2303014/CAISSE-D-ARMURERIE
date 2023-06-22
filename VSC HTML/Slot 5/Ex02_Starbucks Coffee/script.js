
// defines a menu object that contains information about menu items
var menu = {
    "Cafè Americano": { price: 3.99, image: "americano.jpg" },
    "Cafè Latte": { price: 4.59, image: "latte.jpg" },
    "Cappuccino": { price: 3.99, image: "cappuccino.jpg" },
    "Espresso": { price: 2.99, image: "espresso.jpg" },
    "Mocha": { price: 4.79, image: "mocha.jpg" },
    "Caramel Macchiato": { price: 4.79, image: "caramel macchiato.jpg" },
    "White Chocolate Mocha": { price: 4.99, image: "starbucks.jpg" },
    "Java Chip Frappuccino": { price: 5.49, image: "starbucks.jpg" },
    "Green Tea Frappuccino": { price: 4.99, image: "starbucks.jpg" },
    "Chai Tea Latte": { price: 3.99, image: "starbucks.jpg" },
};

// createDrinkMenu function is defined to create the menu on the webpage
function createDrinkMenu(){
    
    // gets a reference to the 'menu-container' element & creates an unordered list to hold the menu items
    var menuContainer = document.getElementById("menu-container");
    var menuList = document.createElement("ul");

    // loops through the 'menu' obj & creates elements for each menu item, including an image, name, and price
    for (var drink in menu){                            // drink = i, ex:  for (i in menu){ 
        var price = menu[drink].price.toFixed(2);
        var image = menu[drink].image;

        var menuItem = document.createElement("li");
        var drinkImage = document.createElement("img");
        var drinkName = document.createElement("p");
        var drinkPrice = document.createElement("p");

        drinkImage.src = image;
        drinkImage.alt = drink;
        drinkName.textContent = drink;
        drinkPrice.textContent = '$' + price;

        menuItem.appendChild(drinkImage);               // adds an element to another element
        menuItem.appendChild(drinkName);
        menuItem.appendChild(drinkPrice);

        menuList.appendChild(menuItem);
    }

    menuContainer.appendChild(menuList);      // used to add menu items to a list and to add the list to a container
}                                             // to display the menu on the page

// 'window.onload' event is set to call the createDrinkMenu function when the page loads, 
// so that the menu is created automatically
window.onload = createDrinkMenu;
