<p align="center">

  <img src="https://github.com/BF2-compiler/bf2-interpreter/assets/81770791/7796d359-80ff-43b0-8e49-f3ddba1dd28d" width="400" height="320"/>


</p>

# Brainfuck ^2

It's our take on *Brainf**k* programming language with some twists and additional functionality.


## Documentation 📖
Documtnation is right here:
[Documentation](https://github.com/BF2-compiler/bf2-interpreter/wiki)


## Demo 

Insert gif or link to demo here


## Screenshots 📸

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)


## Technologies & Tools 🧰
[![Java]( https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)]()
[![ANTLR4]( https://img.shields.io/badge/ANTLR4-ED1A00?style=for-the-badge&logo=AniList&logoColor=white)]()
[![IntelliJ_IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)]()
[![GIT](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)]()
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)]()


## Features 🚀

Here are some things that improve the *Brainf**ck* and help with building more complex applications: 

- Functions
- Conditional statements
- Multiple nested boards
- Loops
    - *do while*
    - *do*
- Embeded functions
    - READ_AS_INT
    - READ_AS_STRING
    - READ_AS_COLORS


## Installation 

Install BF2-compiler with (?)

```bash
  TODO
```
    
## Run Locally 🏃🏼‍♂️

Clone the project

```bash
  git clone https://github.com/BF2-compiler/bf2-interpreter.git
```

Go to the project directory

```bash
  cd compiler
```

Install dependencies

```bash
  (?)
```

Create file with .bf2 extension

```bash
touch my_program.bf2
```

Open it in your editor of choice and write your code!

```bash
vim my_program.bf2
```

Run the program

```bash
  java 19 src/main/interpreter/Bf2App.java src/my_program.bf2
```


## Usage/Examples 🧪

```bf2
% This prints "Hello world" as text

8,8

=72 >=101> =108> =108> =111 >=32
v =100<=108<=114<=111<=119

READ_AS_STRING
```

```bf2
% This prints letter "K" as color panels

12,15

=100v =100v =100v =100v =100v =100v =100v =100 ^^^ >
=100
>^=100 >^=100 >^=100 >^=100
<v <v <v <v
>v=100 >v=100 >v=100

READ_AS_COLORS
```

```bf2
% Random array creation with loops

10,10

=5 if(.=?5){>=3}

if(.=?5){do{>=6}(6)}
else{do{v=81}(6)}

if(.=?5){do{>=6}(6)}
elif(.=?81){do{>=123}(6)}

PRINT_AS_INT
```


## Related

Here are some related projects that helped us a lot:

[ANTLR](https://www.antlr.org)
[Brainfuck](http://brainfuck.org)


## FAQ ❓

[![Ask me anything](https://img.shields.io/badge/Ask%20me-anything-1abc9c.svg)]()

#### How is it different from the original?

There are many more features like reading data as colors or multidimensional board layouts. You can read about all additional features in [Documentation](https://linktodocumentation)

#### What can you use it for?

We don't really know yet .. For now it's just to waste your time ツ




## Feedback 💡

If you have any feedback, please reach out to us at some_mail@agh.edu.pl


## License 🛡️

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)


## Authors 👏🏼

- [@Eryk](https://github.com/ErykMikolajek)
- [@Kuba](https://github.com/kubijaku)
- [@Marcin](https://github.com/MarcinZ20)


## Acknowledgements 🤝🏼

 - [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
- [Freepik logo](https://pl.freepik.com/darmowe-wektory/bol-mozgu_34293861.htm#query=brain%20with%20lightning&position=3&from_view=search&track=ais)
