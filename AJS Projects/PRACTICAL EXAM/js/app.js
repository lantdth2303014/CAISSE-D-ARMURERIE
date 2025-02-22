var app = angular.module("myApp", []);
app.controller("myCtrl", function($scope){
    console.log("My controller....");

    $scope.products=[
        {name:"Product One", price:22.5},
        {name:"Product Two",price:15},
        {name:"Product Three", price:123.82},
        {name:"Product Four", price:123.82},
        {name:"Product Five", price:123.75}
    ];
    $scope.addProduct= function(){
        $scope.products.push($scope.newProduct);
        $scope.newProduct={};
        $scope.message="New Product Add successfully";
    };
    $scope.selectProduct= function(product){
        console.log(product);
        $scope.clickedProduct= product;
    };
    $scope.deleteProduct= function(){
        $scope.products.splice($scope.products.indexOf($scope.clickedProduct), 1);
        $scope.message="Product deleted successfully";
    };
    $scope.clearMessage=function(){
        $scope.message="";
    };
});