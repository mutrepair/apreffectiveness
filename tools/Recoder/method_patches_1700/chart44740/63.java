    public ArcDialFrame(double startAngle, double extent) {
        this.backgroundPaint = Color.gray;
this.foregroundPaint = new Color(100, 150, 100, 100);
        this.stroke = new BasicStroke(2.0f);
        this.innerRadius = 0.25;
        this.outerRadius = 0.75;
        this.startAngle = startAngle;
        this.extent = extent;
    }