(function(){

function controllerFunction($scope,$http){

$scope.message = "This is a test for angular app";
    $http.get("http://localhost:8181/cxf/person")
    .success(function(data){
    $scope.message = data;
    });

};

angular.module("Angular-App",["ngResource"])
.controller("Angular-Controller",controllerFunction);
}())