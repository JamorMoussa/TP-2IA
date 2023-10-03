import cv2


img = cv2.imread("./src/img.jpg")

img_hsv = cv2.cvtColor(img, cv2. COLOR_BGR2HSV)

cv2.imshow("win", img_hsv)
cv2.waitKey(0)