}
public static class WazzPoppinAds {
  private boolean isLoaded;
  private Toast toast;
  private ImageView ads;
  
  public void createWPAds(View view) {
    view.addView(ads);
  }
  public void loadWPAds() {
    isLoaded = true;
  }
  public void showWPAds() {
    if (isLoaded == true) then{
      ads.setImageResource(R.drawable.ads1);
    }else{
      toast.makeText(getApplicationContext()"WPAds is not loaded yet!");
    }
  }
}
{
