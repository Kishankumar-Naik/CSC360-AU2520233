This week's class covered the basics of how images and graphics work on a computer, along with a few Java and Git related topics we needed for the assignment.



Starting with computer graphics vs image processing, I found it useful to finally get a clear line between the two, since I used to think they were kind of the same thing. Now I get it - graphics is about building an image from scratch using shapes and coordinates, while image processing takes an image that already exists and works on it, like sharpening it or removing noise. This made more sense once I thought about real examples - a game engine rendering a 3D scene is graphics, but something like Instagram filters or medical scan enhancement is image processing.



The geometric part (points, lines, curves, area) was a bit more technical, but I liked understanding what actually happens behind something as simple as drawing a line on screen. I never really thought about the fact that a line on a screen isn't a "real" line, it's just pixels arranged close enough to look straight, and algorithms like Bresenham's decide exactly which pixels to light up. Same with circles - I always assumed programs just "draw" them, but there's actual math deciding pixel by pixel where the curve goes.



The Java AWT vs Swing comparison connected well with something I already had some idea about from earlier coding, but I didn't know the difference was about heavyweight vs lightweight components, or that AWT directly uses the OS's own buttons/windows while Swing draws everything itself. It explains why old Java apps sometimes look different depending on which computer you run them on.



MVC was probably the most useful concept for me personally, since I can see how this applies beyond just this course - separating data (model), what user sees (view) and what handles input (controller) is something I've seen mentioned in web dev stuff too, just didn't know the name for it before.



Static vs interactive graphics and the examples were more straightforward to understand since its stuff I interact with daily without thinking about it (games, drag and drop, zooming into maps), so this was more about putting proper terms to things I already experience.



The SSH/HTTPS and public/private key part was honestly the most practical for me this week, since I actually had to set it up myself for pushing to Github. Understanding why my private key never leaves my computer, and how Github still verifies its me without me sending my password every time, made the whole authentication process feel less like a black box.



Overall this class connected some dots between things I already vaguely knew (like Github, Java GUI) and the actual theory/reasoning behind them, which made it easier to remember instead of just following steps blindly.

