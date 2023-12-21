package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.List;

public class body extends Methods {

    public body() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    //////////////////////Aygül/////////////////////

    @FindBy(id ="mat-button-toggle-1-button" )
    public WebElement courseGrade;
    @FindBy(xpath= "//*[text()=' Course Name ']" )
    public WebElement courseName;
    @FindBy(xpath = "//span[contains(text(),'Student Transcript')]")
    public WebElement studentTranscript;
    @FindBy(xpath= "//*[@class='w-100-p']" )
    public WebElement courseCode;
    @FindBy(xpath = "//span[contains(text(),'Transcript By Subject')]")
    public WebElement transccriptSubject;
    @FindBy(xpath= "//*[text()=' Subject '] " )
    public WebElement subject;
    @FindBy(xpath = "//div[@class='cdk-overlay-backdrop cdk-overlay-dark-backdrop cdk-overlay-backdrop-showing']")
    public WebElement discussionButton;
    @FindBy(id = "//div[@id='mat-select-value-3']")
    public WebElement status;
    @FindBy(xpath = "mat-select-min-line ng-tns-c3082329526-91 ng-star-inserted")
    public WebElement published;

   // @FindBy(xpath = "//div[@class='cdk-overlay-backdrop cdk-overlay-dark-backdrop cdk-overlay-backdrop-showing']")
   // public WebElement chatsButton;
    @FindBy(xpath = "//button[@class='mat-mdc-button-touch-target']")
    public WebElement contacts;
    @FindBy(xpath = "//span[contains(text(),'Mark Zuckerberg')]")
    public WebElement person;

 // @FindBy(xpath = "//ms-icon-button[@class='ng-tns-c1298419688-99']//span[@class='mat-mdc-button-touch-target']")
 // public WebElement AttachFiles;










    ///////////////////Senol/////////////////////////

    @FindBy(xpath = "(//ms-confirm-button)[1]")
    public WebElement trashButton;
    @FindBy(xpath = "(//div[@class='mdc-checkbox'])[2]")
    public WebElement checkBoxUs07;
    @FindBy(xpath = "(//ms-standard-button[@color='#6B8E23'])[1]")
    public WebElement restoreButton;
    @FindBy(xpath = "(//ms-delete-button)[1]")
    public WebElement deleteIcon;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//mat-button-toggle[@value='attendance-excuse']")
    public WebElement attendanceExcuses;
    @FindBy(xpath = "//ms-add-button//button")
    public WebElement addButton;
    @FindBy(xpath = "//span[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-selected']")
    public  WebElement selectDayButton;
    @FindBy(xpath = "//span[@class='mat-option-text']")
    public List< WebElement> dayType;
    @FindBy(xpath = " (//div[@cdk-overlay-origin]/div)[6]")
    public WebElement arrowButton;
    @FindBy(xpath = "//button[@aria-label='Open calendar']")
    public WebElement openCalendar;
    @FindBy(xpath = "//ms-textarea-field//textarea")
    public WebElement textField;
    @FindBy(xpath = "//ms-button[@icon='paperclip']")
    public WebElement attachFiles;
    @FindBy(xpath = "//ms-standard-button[@icon='hdd']//button[@role='menuitem']")
    public WebElement fromLocalButton;
    @FindBy(xpath = "//ms-button[@caption='GENERAL.BUTTON.SEND']")
    public WebElement sendButton;
    @FindBy(xpath = "//mat-select[@id='mat-select-2']")
    public WebElement status1;
    @FindBy(xpath = "//mat-option[@id='mat-option-1']")
    public WebElement publishedCheckBox;
    @FindBy(xpath = "//div[@id='mat-select-value-5']")
    public WebElement semester;
    @FindBy(xpath = "//mat-option[@value='all']")
    public WebElement alll;
    @FindBy(xpath = "//span[text()=' 11A- Biology '] ")
    public WebElement biology;
    @FindBy(xpath = "//div[@id='mat-select-value-1']")
    public WebElement showAll;
    @FindBy(xpath = "//span[text()=' 11A- Chemistry ']")
    public WebElement chemistry;
    @FindBy(xpath = "(//strong[text()='11A- Chemistry '])[1]")
    public WebElement assertionChemistry;
    @FindBy(xpath = "//span[text()=' 11A- Geometry ']")
    public WebElement geometry;
    @FindBy(xpath = "(//strong[text()='11A- Geometry '])[1]")
    public WebElement assertionGeometry;
    @FindBy(xpath = "//span[text()=' 11A-Dutch ']")
    public WebElement dutch;
    @FindBy(xpath = "(//strong[text()='11A-Dutch '])[1]")
    public WebElement assertionDutch;
    @FindBy(xpath = "//span[text()=' 11A-Mathematics ']")
    public WebElement mathematics;
    @FindBy(xpath = "(//strong[text()='11A-Mathematics '])[1]")
    public WebElement assertionMathematics;
    @FindBy(xpath = "//span[text()=' 11A-Physical ']")
    public WebElement physical;
    @FindBy(xpath = "//span[text()=' 11A-Spanish ']")
    public WebElement spanish;
    @FindBy(xpath = "(//strong[text()='11A-Spanish '])[1]")
    public WebElement assertionSpanish;
    @FindBy(xpath = "//span[text()=' 11A-Statistics ']")
    public WebElement statistics;
    @FindBy(xpath = "(//span[text()=' Published '])[1]")
    public WebElement assertionPublished;

    @FindBy(xpath = "//mat-option[@id='mat-option-2']")
    public WebElement resultsPublishedCheckBox;
    @FindBy(xpath = "(//span[text()=' Results Published '])[1]")
    public WebElement assertionResultsPublished;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    public WebElement semester1;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    public WebElement semester2;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    public WebElement semesterAll;
    @FindBy(xpath = "//span[@class='iso']")
    public WebElement showBy;
    @FindBy(xpath = "(//button[@tabindex='0'])[2]")
    public WebElement defaultBy;
    @FindBy(xpath = "(//button[@tabindex='0'])[3]")
    public WebElement showByCourse;
    @FindBy(xpath = "(//button[@tabindex='0'])[4]")
    public WebElement showByType;
    @FindBy(xpath = "(//button[@tabindex='0'])[5]")
    public WebElement showByDate;
    @FindBy(xpath = "(//button[@tabindex='0'])[6]")
    public WebElement showByChart;









































    //////////////////////Musab///////////////////////















    //////////////////////Göksah///////////////////////


    //////////////////////Enes///////////////////////
    ////////////////////CalendarLocator//////////////
    @FindBy(xpath = "(//div[@class=\"mat-elevation-z4 ng-star-inserted\"])[1]") //E etiketli biyoloji dersi
    public WebElement pbBiologyCourse;
    @FindBy(xpath = "//ms-tab-group[@class=\"ng-star-inserted\"]") //Calendar'da derslerin bilgi kısmı
    public WebElement courseInformation;
    @FindBy(xpath = "(//div[@class=\"mat-elevation-z4 ng-star-inserted\"])[6]")
    //E etiketli biyoloji dersinin altındaki yayınlanmamış biyoloji dersi
    public WebElement biologyCourse;
    @FindBy(xpath = "//mat-toolbar-row[@class=\"mat-toolbar-row\"]/span") //Tüm derslere ait açılır penceredeki isimler.
    public WebElement coursesName;
    @FindBy(xpath = "//mat-accordion[@class=\"mat-accordion\"]") //Dersin yayınlanmadığına dair açılır pencere uyarısı.
    public WebElement notPublishInfo;
    @FindBy(xpath = "(//ms-dialog-content[@class=\"mat-dialog-content ng-untouched ng-pristine ng-invalid\"]//div)[10]")
    //Tüm yayınlanmamış derslere ait bilgiler.
    public WebElement notPublishCoursesInfo;
    @FindBy(xpath = "//button[@aria-label=\"Close dialog\"]") //açılır pencerelerin kapatma tuşu
    public WebElement closeButton;
    @FindBy(xpath = "(//div[@class=\"mdc-tab mat-mdc-tab mat-mdc-focus-indicator ng-star-inserted\"])[1]")
    //yayınlanmış dersin üst kısmındaki buton
    public WebElement topicButton;
    @FindBy(xpath = "(//div[@class=\"mdc-tab mat-mdc-tab mat-mdc-focus-indicator ng-star-inserted\"])[2]")
    //yayınlanmış dersin üst kısmındaki buton
    public WebElement attachmentsButton;
    @FindBy(xpath = "(//div[@class=\"mdc-tab mat-mdc-tab mat-mdc-focus-indicator ng-star-inserted\"])[3]")
    //yayınlanmış dersin üst kısmındaki buton
    public WebElement recentEventsButton;
    @FindBy(xpath = "//div[@id=\"mat-tab-label-11-0\"]") //yayınlanmış dersin üst kısmındaki buton
    public WebElement informationButton;

    ////////////////////////Finance//////////////////////////
    @FindBy(xpath = "(//ms-standard-button/button)[1]")
    public WebElement eyeButton;
    @FindBy(xpath = "(//div[@class='mdc-radio'])[5]")
    public WebElement stripePayButton;
    /////////////////MESSAGE///////////////
    @FindBy(xpath = "(//ms-button[@class='ng-star-inserted']/button)[1]")
    public WebElement receiversButton;
    @FindBy(xpath = "(//div[@class='mdc-form-field'])[3]")
    public WebElement receiversCheckbox;

    @FindBy(xpath = "(//ms-button[@class='ng-star-inserted']/button)[4]")
    public WebElement addCloseButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='title']")
    public WebElement subjectField;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='title']/input")
    public WebElement subjectTextField;

    //span[text()=' New Message ']
    @FindBy(xpath = "//span[text()=' New Message ']")
    public WebElement newMessageText;

    @FindBy(xpath = "//span[text()='Table']")
    public WebElement tableButton;
    @FindBy(xpath = "//div[text()='Table']")
    public WebElement createTheTable;
    @FindBy(xpath = "//div[@class='tox-insert-table-picker']/div[20]")
    public WebElement tableRows;

    @FindBy(xpath = "//body[@id='tinymce']/table")
    public WebElement createdTable;

    @FindBy(xpath = "//body[@id='tinymce']/p")
    public WebElement messageTextArea;

    @FindBy(xpath = "//div[text()='Delete table']")
    public WebElement deleteTableButton;

    @FindBy(xpath = "//span[text()='Attach Files...']")
    public WebElement attachFilesButton;
    @FindBy(xpath = "//span[text()='From Local']")
    public WebElement msgFromLocalButton;
    @FindBy(xpath = "//ms-button[@caption='USER_MESSAGES.BUTTONS.SEND']")
    public WebElement msgSendButton;

    @FindBy(xpath = "//div[text()='course notes']")
    public WebElement outboxMessage;



    //////////////////////Talat///////////////////////
    @FindBy(xpath = "(//ms-layout-menu-button//button)[1]")
    public WebElement coursesButton;
    @FindBy(xpath = "(//ms-layout-menu-button//button)[2]")
    public WebElement calendarButton;
    @FindBy(xpath = "(//ms-layout-menu-button//button)[3]")
    public WebElement attendanceButton;
    @FindBy(xpath = "(//ms-layout-menu-button//button)[4]")
    public WebElement assignmentsButton;
    @FindBy(xpath = "(//ms-layout-menu-button//button)[5]")
    public WebElement gradingButton;
    @FindBy(xpath = "//button[@class='mat-mdc-menu-trigger mat-button-wrapper mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base']")
    public WebElement hamburgerMenu;
    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messagingButton;
    @FindBy(xpath = "(//div/span[1])[6]")
    public WebElement welcomeText;

    @FindBy(xpath = "//span[contains(.,' Calendar ')]")
    public WebElement calendarText;
    @FindBy(xpath = "//span[contains(.,' Attendance ')]")
    public WebElement attendanceText;
    @FindBy(xpath = "//span[contains(.,' Assignments ')]")
    public WebElement assigmentsText;
    @FindBy(xpath = "//span[contains(.,' Grading ')]")
    public WebElement gradingText;
    @FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
    public List<WebElement> hamburgMenuList;
    @FindBy(xpath = "//span[contains(.,' Student_5 11A - Mark Zuckerberg')]")
    public WebElement student_5Text;
    @FindBy(xpath = "//span[contains(.,' Messages')]")
    public WebElement messagesText;
    @FindBy(xpath = "//div/user-chat-bell")
    public WebElement chatsButton;
    @FindBy(xpath = "//div/user-message-bell")
    public WebElement messageBoxButton;
    @FindBy(xpath = "//span[contains(.,' Student_5 11A - Mark Zuckerberg')]")
    public WebElement chatsWindow;
    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[2]")
    public WebElement profileButton;

    @FindBy(xpath = "//button[@role='menuitem']")
    public List<WebElement> profileButtonList;












    //////////////////////Ümit///////////////////////

    // Messaging > Outbox
    @FindBy(xpath = "//span[text()=' Outbox ']")
    public WebElement outbox;
    @FindBy(xpath = "(//div[@class='mdc-checkbox']/input)[2]")
    public WebElement checkbox;
    @FindBy(xpath = "//span[text()='Move to Trash']")
    public WebElement moveToTrashButton;
    @FindBy(xpath = "//span[text()=' Yes ']")
    public WebElement ConfirmButton;

    // Finance > My Finance
    @FindBy(xpath = "//span[text()=' Students Fees ']")
    public WebElement studentsFees;

    @FindBy(xpath = "(//tr/td)[9]")
    public WebElement balance;

    @FindBy(xpath = "//span[text()=' Student Fee ']")
    public WebElement studentFee;

    @FindBy(xpath = "//label[text()='Stripe ']")  //input[@type='radio' and @value='STRIPE']
    public WebElement paymentProvider;

    @FindBy(xpath = "//input[@type='radio' and @value='CUSTOM_AMOUNT']") //(//span[text()='Pay'])[1]
    public WebElement payRadio;

    @FindBy(xpath = "//input[@data-placeholder='Amount']")
    public WebElement amountInput;

    @FindBy(xpath = "(//span[text()='Pay'])[2]")
    public WebElement payButton;

    @FindBy(css = "#Field-numberInput")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@id='Field-expiryInput']")
    public WebElement expiration;

    @FindBy(xpath = "//input[@id='Field-cvcInput']")
    public WebElement cvc;

    @FindBy(xpath = "//*[@class='stripe-img']")
    public WebElement stripePaymentsButton;

    // Profile > Settings
    @FindBy(xpath = "//span[text()=' Settings']")
    public WebElement settingsText;

    @FindBy(xpath = "//mat-select[@formcontrolname='theme']")
    public WebElement themeDropbox;

    @FindBy(xpath = "//mat-option[@role='option']/span")
    public List<WebElement> themeList;

    @FindBy(xpath = "//mat-toolbar[@class='mat-toolbar p-0 mat-primary mat-toolbar-single-row']")
    public WebElement settingsToolbar;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    public WebElement saveButton;

    // Assignments > Semester dropbox
    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    public WebElement semesterDropbox;

    @FindBy(xpath = "(//mat-option[@role='option'])[1]")
    public WebElement all;

    @FindBy(xpath = "//span[@fxlayout='row']/strong") //div[@class='assignment ng-star-inserted']
    public List<WebElement> homeworkList;

    @FindBy(xpath = "(//div[@class='assignment ng-star-inserted'])[1]//ms-icon-button")
    public List<WebElement> firstHomeworkIconsList;

    @FindBy(xpath = "(//div[@fxlayoutalign.lt-md='space-between center'])[1]")
    public WebElement iconsPosition;

    @FindBy(xpath = "(//div[@class='ng-star-inserted'])[10]")
    public WebElement firstHomeworkPanel;

    @FindBy(xpath = "//div[@class='mdc-tooltip__surface mdc-tooltip__surface-animation']")
    public WebElement iconText;

    @FindBy(xpath = "//span[text()=' Assignment ']")
    public WebElement homeworkDetailsPage;

    @FindBy(xpath = "(//button[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base mat-mdc-tooltip-disabled'])[2]")
    public WebElement homeworkDiscussionButton;

    //////////////////////Talip///////////////////////









    //////////////////////Sokol///////////////////////














    //////////////////////Rustam///////////////////////
    @FindBy(xpath = "//span[text()='New Message']")
    public WebElement newMessage;
    @FindBy(xpath = "//div[@class='ng-star-inserted']/span")
    public WebElement MessagingBoxText;
    @FindBy(xpath = "//div[@style='padding-right: 16px; display: flex; justify-content: flex-end; align-items: center;']/button/span")
    public WebElement button;
    @FindBy(xpath = "//*[@class='profile-image avatar huge ng-star-inserted']")
    public WebElement upload_photo;
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-upload']")
    public WebElement picture;
    @FindBy(xpath = "//*[contains(text(), 'Upload')]")
    public WebElement uploadButton;
    //user21
    @FindBy(xpath = "//*[@class='mat-select-arrow ng-tns-c3082329526-93']")
    public WebElement semesterButton;
    @FindBy(xpath = "//*[text() = 'All ']")
    public WebElement allButton;
    @FindBy(xpath = "//*[@id='mat-select-2']/div/div[2]/div")
    public WebElement statusButton;
    @FindBy(xpath = "//*[@id='mat-option-2']/span")
    public WebElement resultButton;
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-memo-circle-info']")
    public WebElement homeworkicon;
    @FindBy(xpath = " (//span[@class='mat-mdc-button-touch-target'])[24]")
    public WebElement submitbutton;






    //**** user25

    @FindBy(xpath = "//*[@id='container-3']/courses-calendar/div/ms-course-schedule-board/ms-browse/div/div/div/div[2]/button[1]/span[3]")
    public WebElement previousicon;
    @FindBy(xpath = "//*[@class='mat-badge mat-badge-primary mat-badge-overlap mat-badge-below mat-badge-after mat-badge-small']")
    public WebElement endedCourse;

    @FindBy(xpath = "//*[@class='ng-star-inserted'][contains(text(), 'Recording')]")
    public WebElement recordingButon;
    @FindBy(xpath = "//*[@class='vjs-play-control vjs-control vjs-button']")
    public WebElement startButon;
    @FindBy(css = " .assignment.ng-star-inserted ms-icon-button:nth-child(2)")
    public List<WebElement> homeworklist;

















    public WebElement getWebelement(String stringElement) {
        switch (stringElement) {
            case "coursesButton":
                return this.coursesButton;
            case "calendarButton":
                return this.calendarButton;
            case "attendanceButton":
                return this.attendanceButton;
            case "assignmentsButton":
                return this.assignmentsButton;
            case "gradingButton":
                return this.gradingButton;
            case "hamburgerMenu":
                return this.hamburgerMenu;
            case "messagingButton":
                return this.messagingButton;
            case "welcomeText":
                return this.welcomeText;
            case "calendarText":
                return this.calendarText;
            case "attendanceText":
                return this.attendanceText;
            case "assigmentsText":
                return this.assigmentsText;
            case "gradingText":
                return this.gradingText;
            case "student_5Text":
                return this.student_5Text;
            case "messagesText":
                return this.messagesText;
            case "chatsButton":
                return this.chatsButton;
            case "messageBoxButton":
                return this.messageBoxButton;
            case "chatsWindow":
                return this.chatsWindow;
            case "profileButton":
                return this.profileButton;
            case "upload_photo":
                return this.upload_photo;
            case "picture":
                return this.picture;
            case "uploadButton":
                return this.uploadButton;
            case "previousicon":
                return this.previousicon;
            case "endedCourse":
                return this.endedCourse;
            case "recordingButon":
                return this.recordingButon;
            case "startButon":
                return this.startButon;



        }

        return null;
    }
    public List<WebElement> getWebelmentList(String stringList) {
        switch (stringList) {
            case "hamburgMenuList":
                return this.hamburgMenuList;
            case"profileButtonList":
                return this.profileButtonList;
            case"homeworklist":
                return this.homeworklist;

        }
        return null;
    }
}
