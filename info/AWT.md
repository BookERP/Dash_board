# AWT의 구성
## AWT 패키지
> 패키지명이 java.awt로 시작하면 모두 AWT관련 패키지이다.



- java.awt : AWT를 이용한 GUI어플리케이션 작성에 필요한 기본적 클래스와 컴포넌트 제공.
- java.awt.event : GUI어플리케이션에서 발생하는 이벤트를 처리하는데 필요한 클래스,인터페이스 제공.
- java.awt.datatransfer : 어플리케이션 내/어플리케이션 간 데이터 전송 구현에 필요한 클래스, 인터페이스 제공.
- java.awt.dnd : 끌어놓기=드래그 앤 드롭(Drag and Drop) 구현에 필요한 클래스 제공.
- java.awt.font : 폰트와 관련된 클래스,인터페이스를 제공.
- java.awt.image : 이미지 생성, 변경에 사용되는 클래스 제공.
- java.awt.print : 출력에 관련된 클래스와 인터페이스 제공.

---


## Component 

- 모든 컴포넌트의 조상은 Component클래스. (※예외 : 메뉴 관련 컴포넌트)
- Component클래스의 조상은 Object클래스.
- 컴포넌트(AWT컴포넌트) : GUI 화면을 구성하는 데 사용되는, Component클래스와 그 자손 클래스들.

###  1. 일반 컴포넌트 : (최상위조상 : Component).
- Button
- Label
- Checkbox
- List
- Choice
- Scrollbar
- Dialog
- 대화상자요소
- Frame
- TextArea/TextField
- FileDialog(파일열기)..


### 2. 메뉴 컴포넌트 : (최상위조상 : MenuComponent)
- MenuBar
- MenuItem(Menu-PopupMenu, CheckboxMenuItem) 



## Component 주요 메서드
- Color getBackground() : 컴포넌트의 배경색을 얻는다
- void setBackground(Color c) : 컴포넌트의 배경색을 지정된 색으로 변경한다.
- Cursor getCursor() : 컴포넌트에 지정된 커서를 얻는다.
- void setCursor(Cursor c) : 컴포넌트의 커서(마우스포인터) 를 지정한다.
- Font getFont() : 컴포넌트에 지정되어 있는 Font를 얻는다.
- void setFont(Font f) : 컴포넌트의 Font를 지정한다.
- Color getForeground() : 컴포넌트의 전경색을 얻는다.
- void setForeground(Color c) : 컴포넌트의 전경색을 지정한다.
- int getHeight() : 컴포넌트의 높이를 얻는다.
- int getWidth() : 컴포넌트의 폭을 얻는다.
- void setBounds(int x, int y, int witdh, int height) : 컴포넌트의 위치(x,y)와 크기(width, height)를 지정한다.
- Rectangle getBounds() : 컴포넌트의 위치와 크기(Rectangle 객체)를 얻는다.
- Point getLocation() : 컴포넌트의 위치를 얻는다.
- void setLocation(int x, int y) : 컴포넌트의 위치를 지정한다.
- Dimension getSize() : 컴포넌트의 크기를 얻는다.
- void setSize(int width, int height) : 컴포넌트의 크기를 지정한다.
- boolean hasFocus() : 컴포넌트가 현재 focus를 갖고 있는지 알려준다.
- void requestFocus() : 컴포넌트가 focus를 갖도록 한다.
- void paint(Graphics g) : 컴포넌트를 화면에 그린다.
- void repaint() : 컴포넌트를 화면에 다시 그린다.
- void setEnabled(boolean b) : 컴포넌트를 사용가능(true)/불가능(false)하게 한다.
- Container getParent() : 컴포넌트가 포함되어져 있는 컨테이너(parent)를 얻는다.
- void setVisible(boolean b) : 컴포넌트가 화면에 보이게(true)/보이지 않게(false)한다.

---

