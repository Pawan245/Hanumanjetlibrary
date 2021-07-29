




<h1><a href="https://github.com/Pawan245/Hanumanjetlibrary">Hanumanjetlibrary.</a> </h1>





<h2><a id="user-content-prerequisites" class="anchor" aria-hidden="true" href="#prerequisites"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Prerequisites</h2>
<p>Add this in your root <code>build.gradle</code> file (<strong>not</strong> your module <code>build.gradle</code> file):</p>
<div class="highlight highlight-source-groovy-gradle position-relative"><pre><span class="pl-en">allprojects</span> {
	repositories {
		<span class="pl-k">..</span>.
		maven { url <span class="pl-s"><span class="pl-pds">"</span>https://jitpack.io<span class="pl-pds">"</span></span> }
	}
}</pre><div class="zeroclipboard-container position-absolute right-0 top-0">
    <clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="allprojects {
	repositories {
		...
		maven { url &quot;https://jitpack.io&quot; }
	}
}
" tabindex="0" role="button">
      <svg aria-hidden="true" viewBox="0 0 16 16" version="1.1" data-view-component="true" height="16" width="16" class="octicon octicon-clippy js-clipboard-clippy-icon m-2">
    <path fill-rule="evenodd" d="M5.75 1a.75.75 0 00-.75.75v3c0 .414.336.75.75.75h4.5a.75.75 0 00.75-.75v-3a.75.75 0 00-.75-.75h-4.5zm.75 3V2.5h3V4h-3zm-2.874-.467a.75.75 0 00-.752-1.298A1.75 1.75 0 002 3.75v9.5c0 .966.784 1.75 1.75 1.75h8.5A1.75 1.75 0 0014 13.25v-9.5a1.75 1.75 0 00-.874-1.515.75.75 0 10-.752 1.298.25.25 0 01.126.217v9.5a.25.25 0 01-.25.25h-8.5a.25.25 0 01-.25-.25v-9.5a.25.25 0 01.126-.217z"></path>
</svg>
      <svg aria-hidden="true" viewBox="0 0 16 16" version="1.1" data-view-component="true" height="16" width="16" class="octicon octicon-check js-clipboard-check-icon color-text-success d-none m-2">
    <path fill-rule="evenodd" d="M13.78 4.22a.75.75 0 010 1.06l-7.25 7.25a.75.75 0 01-1.06 0L2.22 9.28a.75.75 0 011.06-1.06L6 10.94l6.72-6.72a.75.75 0 011.06 0z"></path>
</svg>
    </clipboard-copy>
  </div></div>
<h2><a id="user-content-dependency" class="anchor" aria-hidden="true" href="#dependency"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Dependency</h2>
<p>Add this to your module's <code>build.gradle</code> file (make sure the version matches the JitPack badge above):</p>
<div class="highlight highlight-source-groovy-gradle position-relative"><pre><span class="pl-en">dependencies</span> {
	<span class="pl-k">..</span>.
	implementation <span class="pl-s"><span class="pl-pds">'</span>com.github.Pawan245:Hanumanjetlibrary:7.1.6<span class="pl-pds">'</span></span>
}</pre><div class="zeroclipboard-container position-absolute right-0 top-0">
    <clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="dependencies {
	...
	implementation 'com.github.Pawan245:Hanumanjetlibrary:7.1.6'
}
" tabindex="0" role="button">
      <svg aria-hidden="true" viewBox="0 0 16 16" version="1.1" data-view-component="true" height="16" width="16" class="octicon octicon-clippy js-clipboard-clippy-icon m-2">
    <path fill-rule="evenodd" d="M5.75 1a.75.75 0 00-.75.75v3c0 .414.336.75.75.75h4.5a.75.75 0 00.75-.75v-3a.75.75 0 00-.75-.75h-4.5zm.75 3V2.5h3V4h-3zm-2.874-.467a.75.75 0 00-.752-1.298A1.75 1.75 0 002 3.75v9.5c0 .966.784 1.75 1.75 1.75h8.5A1.75 1.75 0 0014 13.25v-9.5a1.75 1.75 0 00-.874-1.515.75.75 0 10-.752 1.298.25.25 0 01.126.217v9.5a.25.25 0 01-.25.25h-8.5a.25.25 0 01-.25-.25v-9.5a.25.25 0 01.126-.217z"></path>
</svg>
      <svg aria-hidden="true" viewBox="0 0 16 16" version="1.1" data-view-component="true" height="16" width="16" class="octicon octicon-check js-clipboard-check-icon color-text-success d-none m-2">
    <path fill-rule="evenodd" d="M13.78 4.22a.75.75 0 010 1.06l-7.25 7.25a.75.75 0 01-1.06 0L2.22 9.28a.75.75 0 011.06-1.06L6 10.94l6.72-6.72a.75.75 0 011.06 0z"></path>
</svg>
    </clipboard-copy>
  </div></div>
<h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>1.GifView </h2>
<p> Place this GifView  anywhere in your Xml Layout, And Add resource raw folder in your project And put a gif Image</p>
<div class="highlight highlight-source-java position-relative">
	
	
![GifView](https://raw.githubusercontent.com/Pawan245/toastlib/master/app/src/main/res/drawable/Gif.jpg?raw=true)	

	
	
	
	
	
	
	
	
	
	
	
	
	
<pre>
#SplashyActivity.java
#Here happy.gif  file which is placed under raw Android Resource Directory.

 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GifView.settext("raw/happy"); 
        setContentView(R.layout.splash_screen);
</pre>




#splash_screen.xml
 
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:background="@color/white">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_above="@+id/btnLogin11"
        android:background="@drawable/splash_gradient">

        <com.ram.hanumanjetpacklibrery.GifView
            android:layout_width="1500.0dip"
            android:layout_height="fill_parent"
            android:layout_alignParentBottom="true"           // You can Change This
            android:layout_centerInParent="true"
            android:scaleType="fitXY" />
    </RelativeLayout>
    ..............................................
    .................
    ...............................
    
    
     </RelativeLayout>
    
       

Example :https://github.com/Pawan245/GifView-

  </div></div>
  
  
  
  <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2.ToasterMessage </h2>
<p> Place this ToasterMessage  anywhere in your App Display Toast Message</p>
<div class="highlight highlight-source-java position-relative">
	<pre>#MainActivity.java
ToasterMessage.ShowToast(MainActivity.this,"Thank you!!");
</pre>
	Example :https://github.com/Pawan245/ToasterMessage
  </div></div>
  
  
  <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>3.deleteCache </h2>
<p> Place this deleteCache  anywhere in your App Clear App Cache</p>
<div class="highlight highlight-source-java position-relative">
	<pre>#MainActivity.java
 deleteCache(MainActivity.this);
</pre>
	Example :https://github.com/Pawan245/deleteCache
  </div></div>
  
  
  <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>4.ApicallAny (Volley) </h2>
<p> Place this ApicallAny  anywhere in your App Make Http Network Call</p>
<div class="highlight highlight-source-java position-relative">
	<pre>#MainActivity.java
	
	#withoutParams
	 String url="http://rt.com/api/my.php";
  ApicallAny.ApicallVolleywithoutParams(MainActivity.this,url, new ApicallAny.VolleyCallback() {
            @Override
            public void onSuccess(String result) {
 
              //  do stuff here  

            }

            @Override
            public void onError(String result) {
                //  do stuff here
            }
        });
	
	
	
</pre>
	
<pre>
	
	#withParams
 
  Map<String, String> params = new HashMap<>();

  params.put("param1","val");
  params.put("param2","valx");
        
  String url="http://rt.com/api/my.php";
  ApicallAny.ApicallVolleywithParams(MainActivity.this, url,params, new ApicallAny.VolleyCallback() {
            @Override
            public void onSuccess(String result) {

              //  do stuff here

            }

            @Override
            public void onError(String result) {
                //  do stuff here
            }
        });

</pre>
   Example: https://github.com/Pawan245/VolleyApicallany
  </div></div>
 
 
 
 
 
 
  <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>5.RetroApiAnyCall (Retrofit 2) </h2>
<p> Place this ApicallAny  anywhere in your App Make Http Network Call</p>
<div class="highlight highlight-source-java position-relative"><pre>
	
	#MainActivity.java
	
	
	Add  implementation 'com.squareup.retrofit2:retrofit:2.6.1' in build.gradle file
	for declaration    Call<String> stringCall .
	
        api   service =  RetrofitClient.getStringClient("http:/xyz.com/").create(api.class);
	
        Call<String> stringCall = service.placeorder("8","1");


        RetroApiAnyCall.ApiStringCallRetro(stringCall, new RetroApiAnyCall.RetroCallbackApi() {
            @Override
            public void onSuccess(String result) {
               
	       //do stuff here
            }

            @Override
            public void onError(String result) {
               
	       //do stuff here 
            }
        });




	public  interface  api{

        @FormUrlEncoded
        @POST("Api/details.php")
        Call<String> placeorder( @Field("class_id") String id, @Field("sec_id") String secid );

    }
    
    
    
    
    
	
	
</pre>
	
Example: https://github.com/Pawan245/RetroApiAnyCall
  </div></div>
 
  <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>6.RetroApiAnyCall (Retrofit 2) Any Model Class </h2>
<p> Place this ApicallAny  anywhere in your App Make Http Network Call</p>
<div class="highlight highlight-source-java position-relative"><pre>
	
	
	
	
	Add  implementation 'com.squareup.retrofit2:retrofit:2.6.1' in build.gradle file
	for declaration    Call<List<Hero>> stringCall .
	
        
        api service = RetrofitClient.getModelClient("http://xyz.com/").create(api.class);


        Call<List<Hero>> stringCall = service.getHeroes();

        RetroApiAnyCall.ApiModelCallRetro(stringCall, new RetroApiAnyCall.RetroCallbackApiModel() {
            @Override
            public void onError(String result) {
                Log.i("PPZ", "" + result + "");
            }

            @Override
            public <E> void onSuccess(List<E> body) {
               
	       //do stuff here
            }

            @Override
            public void onError(String result) {
               
	       //do stuff here 
            }
        });




	 public interface api {


        @GET("marvel")
        Call<List<Hero>> getHeroes();

    }

#Hero
    import com.google.gson.annotations.SerializedName;

    public class Hero {

    @SerializedName("name")
    private String name;
    private String realname;

    public void setName(String name) {
        this.name = name;
    }
    
    ...................
    .............................
    }
    
    
    
	
	
</pre>
Example: https://github.com/Pawan245/RetroApiAnyCall	

  </div></div>
 
 
 
  <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>7.HanumanSpinner </h2>
<p> Place this HanumanSpinner  anywhere in your App Show Spinner</p>
<div class="highlight highlight-source-java position-relative">

![HanumanSpinner](https://raw.githubusercontent.com/Pawan245/toastlib/master/app/src/main/res/drawable/spin.jpg?raw=true)
	



<pre>

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        com.ram.hanumanjetpacklibrery.HanumanCustomEditText gh = findViewById(R.id.et_search_jobs);
        Map<String, String> paramst = new HashMap<>();

        paramst.put("grapes", "12");
        paramst.put("lime", "129");
        paramst.put("lemon", "123");
        paramst.put("cherry", "126");
        paramst.put("blueberry", "128");
        paramst.put("banana", "123");


        gh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

  HanumanSpinner.ShowSpinner(gh, 0, 0, loginactivity.this, paramst,
  "Category", new HanumanSpinner.SpinnerItemOnClick() {
  
  
  @Override
  public void onItemClick(String key, String value) {
    ToasterMessage.ShowToast(loginactivity.this, "K" + key + " Val " + value + "");
    gh.setText("Key" + value + " ");
    }
    @Override
    public void SetHeader() {
     ToasterMessage.ShowToast(loginactivity.this, "Category");
                    }
                });
            }
        });
	
</pre>
	
Example: https://github.com/Pawan245/HanumanSpinner
  </div></div>
 
 <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>8.HanumanAdapter </h2>
<p> Place this HanumanAdapter  anywhere in your App Show RecyclerView Items With Filter With <T> Class Type</p>
<div class="highlight highlight-source-java position-relative">

![HanumanAdapter](https://raw.githubusercontent.com/Pawan245/toastlib/master/app/src/main/res/drawable/Screenshot_2recyle.jpg?raw=true)



Example: https://github.com/Pawan245/HanumanAdapter-
	

  </div></div>
 
 
 
  <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>9.HanumanCheckInternet </h2>
<p> Place this HanumanCheckInternet anywhere in your App for Checking Internet Connection.</p>
<div class="highlight highlight-source-java position-relative">

  </div></div>
 
 
  
  <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>10.StartAnyActivity </h2>
<p> Place this StartAnyActivity anywhere in your App for Start A Activity.</p>
<div class="highlight highlight-source-java position-relative">
<pre>
package a.z;
import android.os.Bundle;
import android.os.Handler;
import com.ram.hanumanjetpacklibrery.StartAnyActivity;
import a.z.R;

public class Splash<<T>T> extends  StartAnyActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivityAnyAndFinish(Splash.this, (Class<T>) jaysitaram.class);
                //startActivityAny(Splash.this, (Class<T>) jaysitaram.class); //Only for start new Activity


            }
        }, 3000);

    }

}
</pre>
  </div></div>
 
 
 <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>11.HanumanBundleSet </h2>
<p> Place this HanumanBundleSet anywhere in your App for Pass Extra Over Intent.</p>
<div class="highlight highlight-source-java position-relative">
<pre>


                #Splash.class
                Map<String,String> fg= new HashMap<>();

                fg.put("AS","1");
                fg.put("AST","2");


                Intent intent = new Intent(Splash.this,jaysitaram.class);
                intent.putExtras(HanumanBundleSet.SetBundleString(fg));
                startActivity(intent);
                finish();
		
		 #jaysitaram.class
		 
		 Intent getIntent = getIntent();
                 ToasterMessage.ShowToast(jaysitaram.this,getIntent.getStringExtra("AS"));

		
		
</pre>
  </div></div>
  <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>12.HanumanCustomEditText </h2>
<p> Place this HanumanCustomEditText xml layout.</p>
<div class="highlight highlight-source-java position-relative">

  </div></div>
  
 <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>13.HanumanCustomAutoCompleteEditText </h2>
<p> Place this HanumanCustomAutoCompleteEditText xml layout.</p>
<div class="highlight highlight-source-java position-relative">

  </div></div>
  
  
   <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>14. HanumanExpandableTextView  </h2>
<p> Place this  HanumanExpandableTextView  xml layout.</p>
<div class="highlight highlight-source-java position-relative">

  </div></div>
  
  <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>15. HanumanFaustinaBoldTextView  </h2>
<p> Place this  HanumanFaustinaBoldTextView  xml layout.</p>
<div class="highlight highlight-source-java position-relative">

  </div></div>
  
  
  <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>16. HanumanFaustinaRegularTextView  </h2>
<p> Place this  HanumanFaustinaRegularTextView  xml layout.</p>
<div class="highlight highlight-source-java position-relative">

  </div></div>
  
  
  <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>17. HanumanFaustinaSemiBoldItalicTextView  </h2>
<p> Place this  HanumanFaustinaSemiBoldItalicTextView  xml layout.</p>
<div class="highlight highlight-source-java position-relative">

  </div></div>
  
  
  <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>18. HanumanMontserratBoldTextView  </h2>
<p> Place this HanumanMontserratBoldTextView  xml layout.</p>
<div class="highlight highlight-source-java position-relative">
  </div></div>	
	
<h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>19.HanumanMontserratLightTextView  </h2><p> Place this  HanumanMontserratLightTextView  xml layout.</p>
<div class="highlight highlight-source-java position-relative">
  </div></div>
  
  
  <h2><a id="user-content-configuration" class="anchor" aria-hidden="true" href="#configuration"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>20. HanumanCustomRelativeLayout  </h2>
<p> Place this  HanumanCustomRelativeLayout  xml layout.</p>
<div class="highlight highlight-source-java position-relative">

  </div></div>
  
  
  
  
    LICENSE (Apache License Version 2.0, January 2004)


  
  </readme-toc>


</div>
 
