var app = angular.module('myApp', []);

app.controller('myCtrl', function($scope, $http) {
  $scope.user = {};
  $scope.products = [];

  $scope.addUser = function() {
    if ($scope.validateUser()) {
      // Gửi dữ liệu đăng ký người dùng lên máy chủ (nếu cần)

      // Lưu thông tin người dùng vào tệp JSON
      $http.post('users.json', $scope.user)
        .then(function(response) {
          // Thêm người dùng vào danh sách
          $scope.products.push($scope.user);
          // Xóa dữ liệu đăng ký người dùng
          $scope.user = {};
        })
        .catch(function(error) {
          console.log(error);
        });
    }
  };

  $scope.validateUser = function() {
    // Kiểm tra tính hợp lệ của dữ liệu đăng ký người dùng
    // Ví dụ: Kiểm tra định dạng email, mật khẩu có đủ độ dài, v.v.

    // Trả về true nếu dữ liệu hợp lệ, ngược lại trả về false
    return true;
  };
});
