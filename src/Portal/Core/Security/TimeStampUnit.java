package Portal.Core.Security;

public enum TimeStampUnit {
  Ticks(0L),
  MiliSeconds(1L),
  Seconds(2L),
  HalfaMinutes(3L),
  Minutes(4L),
  TenMinutes(5L),
  ;
  private long numVal;

  TimeStampUnit(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
