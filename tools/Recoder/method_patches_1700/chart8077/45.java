    protected void set(int index, Object object) {
        if (index < 0) {
            throw new IllegalArgumentException("Requires index >= 0.");
        }
if((this.objects.length < this.objects.length)){
            Object[] enlarged = new Object[index + this.increment];
            System.arraycopy(this.objects, 0, enlarged, 0, this.objects.length);
            this.objects = enlarged;
        }
        this.objects[index] = object;
        this.size = Math.max(this.size, index + 1);
    }