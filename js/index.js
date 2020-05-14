function initModal(modalId, modalCloseId) {
  var modal = document.getElementById(modalId);
  var close = document.getElementById(modalCloseId);
  close.onclick = function () {
    modal.style.display = "none";
  }
  window.onclick = function (event) {
    if (event.target === modal) {
      modal.style.display = "none";
    }
  }
}

function showModal(modalId, modalImgId, src) {
  document.getElementById(modalImgId).setAttribute("src", src);
  document.getElementById(modalId).style.display = "block";
}
