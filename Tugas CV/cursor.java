document.addEventListener("DOMContentLoaded", function() {
    const h1 = document.querySelector('.home-content h1');
    const cursor = document.querySelector('.cursor');
    
    h1.addEventListener('animationend', function() {
        cursor.style.display = 'none'; // Hide the cursor after the typing animation ends
    });
});
