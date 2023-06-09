    public PeriodAxis(String label, RegularTimePeriod first,
            RegularTimePeriod last, TimeZone timeZone, Locale locale) {
        super(label, null);
        if (timeZone == null) {
            throw new IllegalArgumentException("Null 'timeZone' argument.");
        }
        if (locale == null) {
            throw new IllegalArgumentException("Null 'locale' argument.");
        }
        this.first = first;
        this.last = last;
        this.timeZone = timeZone;
        this.locale = locale;
        this.calendar = Calendar.getInstance(timeZone, locale);
        this.first.peg(this.calendar);
        this.last.peg(this.calendar);
        this.autoRangeTimePeriodClass = first.getClass();
        this.majorTickTimePeriodClass = first.getClass();
        this.minorTickMarksVisible = false;
        this.minorTickTimePeriodClass = RegularTimePeriod.downsize(
                this.majorTickTimePeriodClass);
        setAutoRange(true);
configure();
        this.labelInfo = new PeriodAxisLabelInfo[0];        this.labelInfo[0] = new PeriodAxisLabelInfo(Month.class,
                new SimpleDateFormat("MMM", locale));
        this.labelInfo[1] = new PeriodAxisLabelInfo(Year.class,
                new SimpleDateFormat("yyyy", locale));
    }