class Parent extends Person {
    Parent spouse;
    Child[] children = new Child[]{};

    public Parent (String name, int age, Parent spouse) {
        super(name, age);
        this.spouse = spouse;
    }

    public Parent (String name, int age) {
        super(name, age);
    }

    public void setSpouse (Parent spouse) {
        this.spouse = spouse;
    }

    public Parent getSpouse () {
        return this.spouse;
    }

    public void setChildren (Child[] children) {
        this.children = children;
    }

    public Child[] getChildren () {
        return this.children;
    }

    public void addChild (Child child) {
        Child[] temp = new Child[this.children.length+1];
        for (int i = 0; i < this.children.length; i++) {
            temp[i] = this.children[i];
        }
        temp[this.children.length] = child;
        this.children = temp;
    }
}