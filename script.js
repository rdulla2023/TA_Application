// script.js
const container = document.getElementById('container');
const registerBtn = document.getElementById('register');
const loginBtn = document.getElementById('login');

registerBtn.addEventListener('click', () => {
    container.classList.add("active");
});

loginBtn.addEventListener('click', () => {
    container.classList.remove("active");

});

const generateCaptcha = () => {
    let chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    let captchaLength = 6;
    let captcha = "";

    for (let i = 0; i < captchaLength; i++) {
        let randomIndex = Math.floor(Math.random() * chars.length);
        captcha += chars.charAt(randomIndex);
    }

    document.getElementById("captcha").innerHTML = captcha;
    document.getElementById("userInput").value = "";
    document.getElementById("result").innerHTML = "";
}

generateCaptcha();

// Captcha validation
const validateCaptcha = () => {
    let userInput = document.getElementById("userInput").value;
    let captcha = document.getElementById("captcha").innerHTML;
    let resultElement = document.getElementById("result");

    if (userInput === captcha) {
        resultElement.innerHTML = "You don't appear to be a robot.";
        resultElement.style.color = "#601484";
    } else {
        resultElement.innerHTML = "Invalid captcha. Please try again!";
        resultElement.style.color = "red";
    }
};

// Form validation
function validateForm() {
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;
  /* var captcha = document.getElementById("userInput").value;  */

    if (name === "" || email === "" || password === "" || confirmPassword === "" || captcha === "") {
        alert("Please fill in all required fields.");
        return false; // Prevent form submission
    } else if (password !== confirmPassword) {
        alert("Password and Confirm Password do not match.");
        return false; // Prevent form submission
    } else if (!isPasswordStrong(password)) {
        alert("Password is not strong enough.");
        return false; // Prevent form submission
    } else {
        alert('Registration Successful!'); // Display success message
        return true; // Allow form submission
    }
}

// Password strength check
function isPasswordStrong(password) {
    // Regular expression to check if password is strong
    var strongRegex = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?=.{8,})");
    return strongRegex.test(password);
}