Computer Graphics vs Image Processing



Computer graphics means creating an image from scratch using math and shapes - like when a game or 3D software builds a picture out of models and coordinates. So its going from an idea/description to an actual image.



Image processing means we already have an image (like a photo) and we work on it to make it better or get information out of it - things like removing noise, sharpening, detecting edges, compressing size.



Simple way to remember - graphics creates an image, image processing improves or analyzes an image that already exists.



Basic geometric concepts behind drawing

Every image/drawing is made of points placed on a grid, each point has a position (x,y)

A line is just the straight distance between 2 points. Since a screen is made up of small squares (pixels), the computer has to figure out which pixels to color to make it look like a straight line. There are algorithms for this like DDA and Bresenham's algorithm.

A curve (like a circle) can't be made with straight lines, so it uses a math formula to figure out where to place pixels around a center point.

A closed shape (like a triangle or circle) can be filled with color by scanning row by row and coloring everything between the left and right edge, or by starting from the middle and spreading color outward until it hits the border.

Transformation means moving, resizing, rotating or flipping a shape.

Clipping means cutting off the part of a drawing that goes outside the visible screen.

Since our screens are 2D but some objects are 3D, there needs to be a way to convert 3D points into a flat 2D image, this is called projection.

Line, Curve, Area



Line - straight connection between 2 points, drawn pixel by pixel using DDA or Bresenham's algorithm (Bresenham is faster because it only uses whole numbers, not decimals)



Curve - a bent path, not straight, represented using a math equation (like the circle formula) so the computer knows where to place each pixel



Area - a closed shape that needs its inside colored in, done by scanning across and filling in color between the edges



Java AWT and Swing (GUI tools in Java)



AWT (Abstract Window Toolkit) - the original way java made GUI apps. When you make a button in AWT, it directly uses the actual button from your operating system. This makes it fast, but the look changes depending on what OS you're using (windows/mac/linux)



Swing - newer, built on top of AWT. Instead of using the OS's own buttons/windows, Java draws everything itself. This means the app looks the same no matter what OS you run it on, and gives more options for making UI's (tables, tabs etc)



Speed wise - AWT is a bit faster since it lets the OS do the drawing. Swing takes a little more processing power since java is drawing everything itself, but it looks the same everywhere and gives more design control.



How user interfaces are usually structured (MVC)



This is a common way to organize code for anything with a user interface, split into 3 parts:



Model - stores the actual data/information, doesn't care how its shown on screen

View - the part the user sees on screen (buttons, windows, images etc)

Controller - listens for what the user does (click, type) and updates the Model based on that



When the Model changes, the View automatically updates to show the new data. This keeps the data handling and the visual part separate, so its easier to fix/change one without breaking the other.



Static vs Interactive graphics



Static graphics - an image is created once and just stays like that, user cant do anything to change it. Example - a printed photo, a saved jpg file.



Interactive graphics - the image changes in real time based on what the user does (clicking, moving mouse, typing). Example - a video game, paint app, or any app with clickable buttons.



Static just needs to draw the image one time. Interactive needs to keep checking for user input and redraw the image again and again whenever something changes.



Examples of interactive graphics

moving the mouse cursor and seeing it move on screen

clicking a button and it changing color/doing an action

dragging an item from one place to another (drag and drop)

drawing a shape freehand with the mouse and seeing it appear live (like paint)

video games responding instantly to keyboard/mouse

rotating or zooming into a 3D object or map

hovering over a graph/chart and seeing extra info pop up

using pinch/swipe/tap gestures on a phone screen



basically all of these follow the same pattern - user does something -> data updates -> screen redraws to show the new result



SSH vs HTTPS (for accessing git repositories like Github)



Both are ways to connect to Github to upload/download code, just different methods of logging in.



SSH - uses a pair of keys (one kept secret on your pc, one shared with github) to log you in automatically without asking for username/password every time. Slightly more setup in the beginning but easier to use afterwards. Sometimes blocked on restricted networks (like some college/office wifi)



HTTPS - uses your github username and a token (like a password) to log in. Easier to set up quickly, but might ask you to log in again depending on settings. Works on almost any network since it uses the same connection type as normal browsing.



Public and Private keys



These are a pair of keys used to prove who you are or to keep data safe, without ever sending your actual password over the internet.



Public key - can be shared with anyone, its used by others to confirm its really you or to send you something only you can open

Private key - kept secret on your own computer, never shared with anyone, used to unlock/prove things related to your public key



They are created together as a matching pair, and even if someone has your public key, they cannot figure out your private key from it.



How its used in Github login - Github has your public key saved. When you try to connect, github sends a small test that only your private key can solve correctly. If it solves it, github knows its really you, and your private key never actually gets sent anywhere.



Simple way to think about it - public key is like handing someone an open lock, they can lock something with it, but only your private key (the actual key) can open that lock back up.

