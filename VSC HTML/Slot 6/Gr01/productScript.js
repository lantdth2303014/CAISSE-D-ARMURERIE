// ---------------------------------------------------------------

// Create the header element
const header = document.createElement('header');

// Create the h1 element
const h1 = document.createElement('h1');
h1.innerHTML = '<span>CHAIR</span> WEBSITE';
header.appendChild(h1);

// Create the nav element
const nav = document.createElement('nav');
header.appendChild(nav);

// Create the ul element
const ul = document.createElement('ul');
nav.appendChild(ul);

// Create the li and a elements
const li1 = document.createElement('li');
const a1 = document.createElement('a');
a1.href = '#';
a1.textContent = 'Home';
li1.appendChild(a1);
ul.appendChild(li1);

const li2 = document.createElement('li');
const a2 = document.createElement('a');
a2.href = '#';
a2.textContent = 'Gallery';
li2.appendChild(a2);
ul.appendChild(li2);

const li3 = document.createElement('li');
const a3 = document.createElement('a');
a3.href = window.location.href;
a3.textContent = 'Product';
li3.appendChild(a3);
ul.appendChild(li3);

const li4 = document.createElement('li');
const a4 = document.createElement('a');
a4.href = '#';
a4.textContent = 'Contact';
li4.appendChild(a4);
ul.appendChild(li4);

// Append the header to the body of the page
document.body.appendChild(header);

// ---------------------------------------------------------------

// Create the section1 element
const section1 = document.createElement('section');

// Create 3 article elements
for (let i = 1; i <= 4; i++) {
  const article = document.createElement('article');

  const figure = document.createElement('figure');
  const img = document.createElement('img');
  if (i === 1) {
    img.src = 'Black Chair.jpg';
    img.alt = 'Black Chair';
  } 
  else if (i === 2) {
    img.src = 'Round Red and Beige Bar Stool.jpg';
    img.alt = 'Red and Beige Bar Stool';
  } 
  else if (i === 3) {
    img.src = 'Suede Armchair.jpg';
    img.alt = 'Suede Armchair';
  } 
  else {
    img.src = 'White Wicker Armchair.jpg';
    img.alt = 'White Wicker Armchair';
  }
  img.style.width = '290px';
  img.style.height = '220px';
  figure.appendChild(img);
  article.appendChild(figure);

  const hgroup = document.createElement('hgroup');
  const h2 = document.createElement('h2');
  if (i === 1) {
    h2.textContent = 'BLACK CHAIR';
  } 
  else if (i === 2) {
    h2.textContent = 'ROUND RED AND BEIGE BAR STOOL';
  } 
  else if (i === 3) {
    h2.textContent = 'SUEDE ARMCHAIR';
  }
  else {
    h2.textContent = 'WHITE WICKER ARMCHAIR';
  }
  hgroup.appendChild(h2);

  const h4 = document.createElement('h4');
  h4.textContent = 'About';
  hgroup.appendChild(h4);

  const hr = document.createElement('hr');
  hgroup.appendChild(hr);

  const h3 = document.createElement('h3');
  if (i === 1) {
    h3.textContent = '$73.12';
  } 
  else if (i === 2) {
    h3.textContent = '$52.93';
  } 
  else if (i === 3) {
    h3.textContent = '$101.16';
  } 
  else {
    h3.textContent = '$259.73';
  }
  hgroup.appendChild(h3);
  article.appendChild(hgroup);

  const input = document.createElement('input');
  input.type = 'button';
  input.value = 'Add to Cart';
  article.appendChild(input);

  const p = document.createElement('p');
  
  if (i ===1){
  p.innerHTML ='The Black Chair is sleek, simple, and superb in any kitchen setting<br/>Great for any modern or contemporary home setup<br/>Whatever suits your needs, this dining chair will make a natural fit<br/>Overall Size:21.25” W x23” D x39.5” H<br/>';
  }
  else if(i===2){
  p.innerHTML ='Swivel bar stool that is perfect for any shop, garage or home<br/>Constructed with heavy-duty steel for durability and supports up-to 250 lbs<br/>Seat measures 14.5" in diameter and has high density foam padding for comfort<br/>Top swivels 360-degrees on ball bearings for smooth movement<br/>';
  }
  else if(i==3){
  p.innerHTML ='Available in Multiple Fabrics<br/>Pair with a Desk, Current Furniture Set, & Much More<br/>Solid Red Oak Legs<br/>Soft Velvet Fabric & Detachable Foam Cushion<br/>(L) 25.25 in. x (W) 26.75 in. x (H) 33.5 in.<br/>';
  }
  else{
  p.innerHTML ='All weather resin wicker<br/>Steel frame for extra durability<br/>Hose off and wipe clean<br/>The chairs even stack for easy, off-season storage<br/>';
  }
  article.appendChild(p);
  section1.appendChild(article);
}

// Append the section to the body of the page
document.body.appendChild(section1);

//------------------------------------------------------------------

// Create the footer element
const footer = document.createElement('footer');
const div = document.createElement('div');
div.className = 'container';
const p3 = document.createElement('p');
p3.innerHTML = '&copy; 2023 Chair Website. All rights reserved';
div.appendChild(p3);
footer.appendChild(div);

// Append the aside and footer to the body of the page
document.body.appendChild(footer);
