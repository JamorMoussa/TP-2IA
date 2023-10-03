import cv2


img = cv2.imread("./src/img.jpg")

cv2.imshow("win", img)
cv2.waitKey(0)