class Child extends Person {
    Parent parent1;
    Parent parent2;
    Child[] siblings = new Child[]{};

    public Child (String name, int age, Parent parent1, Parent parent2) {
        super(name, age);
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    public Parent getParent1 () {
        return this.parent1;
    }

    public Parent getParent2 () {
        return this.parent2;
    }

    public void setSiblings (Child[] siblings) {
        this.siblings = siblings;
    }

    public Child[] getSiblings () {
        return this.siblings;
    }

    public void addSibling (Child sibling) {
        Child[] temp = new Child[this.siblings.length+1];
        for (int i = 0; i < this.siblings.length; i++) {
            temp[i] = this.siblings[i];
        }
        temp[this.siblings.length] = sibling;
        this.siblings = temp;
    }
}