package org.jameel.san;

public class Page5 {

// 0 Name of App1/ Name of App 2 @Page(value = "//*[@id=\"app_nm_5_1\"]")
// 1
// 2 Bank A/C Total
// 3 Other A/C Total
// 4 Cash Assets
// 5 Property Assests 1
// 6 Value 1
// 7 Property Assests 2
// 8 Value2
// 9 Property Assests 3
// 10 Value 3
// 11 Total Property Assests
// 12 Contribution On Property
// 13 Automobile Make & Year @Page(value = "//*[@id=\"auto_own_5_1\"]")
// 14 Automobile Value @Page(value = "//*[@id=\"mot_val_5_1\"]")
// 15 Other Assests1 @Page(value = "//*[@id=\"tt1_oth_ass_5_1\"]")
// 16 Other Assests 2 @Page(value = "//*[@id=\"tt2_oth_ass_5_1\"]")
// 17 Other Assests 3 @Page(value = "//*[@id=\"tt3_oth_ass_5_1\"]")
// 18 Total Other Assests @Page(value = "//*[@id=\"tt_val_5_1\"]")
// 19 Total Assests @Page(value = "//*[@id=\"tt_ass1_5_1\"]")

    @ExcelCell(position = 0)
    @Page(value = "//*[@id=\"app_nm_5_1\"]")
    public String field0;

    @ExcelCell(position = 1, type = Type.DATE)
    public String field1;

    @ExcelCell(position = 2, type = Type.CURRENCY)
    @Page(value = "//*[@id=\"bnk_acc_5_1\"]")
    public String field2;

    @ExcelCell(position = 3, type = Type.CURRENCY)
    @Page(value = "//*[@id=\"oth_acc_5_1\"]")
    public String field3;

    @ExcelCell(position = 4, type = Type.CURRENCY)
    @Page(value = "//*[@id=\"csh_acc_5_1\"]")
    public String field4;

    @ExcelCell(position = 5)
    @Page(value = "//*[@id=\"ass_add1_5_1\"]")
    public String field5;

    @ExcelCell(position = 6, type = Type.CURRENCY)
    @Page(value = "//*[@id=\"ass_val1_5_1\"]")
    public String field6;

    @ExcelCell(position = 7)
    @Page(value = "//*[@id=\"ass_add2_5_1\"]")
    public String field7;

    @ExcelCell(position = 8, type = Type.CURRENCY)
    @Page(value = "//*[@id=\"ass_val2_5_1\"]")
    public String field8;

    @ExcelCell(position = 9)
    @Page(value = "//*[@id=\"ass_add3_5_1\"]")
    public String field9;

    @ExcelCell(position = 10, type = Type.CURRENCY)
    @Page(value = "//*[@id=\"ass_val3_5_1\"]")
    public String field10;

    @ExcelCell(position = 11, type = Type.CURRENCY)
    @Page(value = "//*[@id=\"tt_ass_5_1\"]")
    public String field11;

    @ExcelCell(position = 12, type = Type.CURRENCY)
    @Page(value = "//*[@id=\"con_pd_5_1\"]")
    public String field12;

    @ExcelCell(position = 13)
    public String field13;
    @ExcelCell(position = 14)
    public String field14;
    @ExcelCell(position = 15)
    public String field15;
    @ExcelCell(position = 16, type = Type.CURRENCY)
    public String field16;
    @ExcelCell(position = 17)
    public String field17;
    @ExcelCell(position = 18, type = Type.CURRENCY)
    public String field18;
    @ExcelCell(position = 19)
    public String field19;
    @ExcelCell(position = 20)
    public String field20;
    @ExcelCell(position = 21, type = Type.CURRENCY)
    public String field21;
    @ExcelCell(position = 22)
    public String field22;
    @ExcelCell(position = 23)
    public String field23;
    @ExcelCell(position = 24)
    public String field24;
    @ExcelCell(position = 25)
    public String field25;
    @ExcelCell(position = 26)
    public String field26;
    @ExcelCell(position = 27)
    public String field27;
    @ExcelCell(position = 28)
    public String field28;
    @ExcelCell(position = 29)
    public String field29;
    @ExcelCell(position = 30)
    public String field30;
    @ExcelCell(position = 31)
    public String field31;
    @ExcelCell(position = 32)
    public String field32;
    @ExcelCell(position = 33)
    public String field33;
    @ExcelCell(position = 34)
    public String field34;
    @ExcelCell(position = 35)
    public String field35;
    @ExcelCell(position = 36)
    public String field36;
    @ExcelCell(position = 37)
    public String field37;
    @ExcelCell(position = 38)
    public String field38;
    @ExcelCell(position = 39)
    public String field39;
    @ExcelCell(position = 40)
    public String field40;
    @ExcelCell(position = 41)
    public String field41;
    @ExcelCell(position = 42)
    public String field42;
    @ExcelCell(position = 43)
    public String field43;
    @ExcelCell(position = 44)
    public String field44;
    @ExcelCell(position = 45)
    public String field45;
    @ExcelCell(position = 46)
    public String field46;
    @ExcelCell(position = 47)
    public String field47;
    @ExcelCell(position = 48)
    public String field48;
    @ExcelCell(position = 49)
    public String field49;
    @ExcelCell(position = 50)
    public String field50;
    @ExcelCell(position = 51)
    public String field51;
    @ExcelCell(position = 52)
    public String field52;
    @ExcelCell(position = 53)
    public String field53;
    @ExcelCell(position = 54)
    public String field54;
    @ExcelCell(position = 55)
    public String field55;
    @ExcelCell(position = 56)
    public String field56;
    @ExcelCell(position = 57)
    public String field57;
    @ExcelCell(position = 58)
    public String field58;
    @ExcelCell(position = 59)
    public String field59;
    @ExcelCell(position = 60)
    public String field60;
    @ExcelCell(position = 61)
    public String field61;
    @ExcelCell(position = 62)
    public String field62;
    @ExcelCell(position = 63)
    public String field63;
    @ExcelCell(position = 64)
    public String field64;
    @ExcelCell(position = 65)
    public String field65;

    @ExcelCell(position = 66, type = Type.DATE)
    public String field66;

    @ExcelCell(position = 67)
    public String field67;

    @ExcelCell(position = 68)
    public String field68;

    @Override
    public String toString() {
        return "Page5 [field0=" + field0 + ", field1=" + field1 + ", field2=" + field2 + ", field3=" + field3
                + ", field4=" + field4 + ", field5=" + field5 + ", field6=" + field6 + ", field7=" + field7
                + ", field8=" + field8 + ", field9=" + field9 + ", field10=" + field10 + ", field11=" + field11
                + ", field12=" + field12 + ", field13=" + field13 + ", field14=" + field14 + ", field15=" + field15
                + ", field16=" + field16 + ", field17=" + field17 + ", field18=" + field18 + ", field19=" + field19
                + ", field20=" + field20 + ", field21=" + field21 + ", field22=" + field22 + ", field23=" + field23
                + ", field24=" + field24 + ", field25=" + field25 + ", field26=" + field26 + ", field27=" + field27
                + ", field28=" + field28 + ", field29=" + field29 + ", field30=" + field30 + ", field31=" + field31
                + ", field32=" + field32 + ", field33=" + field33 + ", field34=" + field34 + ", field35=" + field35
                + ", field36=" + field36 + ", field37=" + field37 + ", field38=" + field38 + ", field39=" + field39
                + ", field40=" + field40 + ", field41=" + field41 + ", field42=" + field42 + ", field43=" + field43
                + ", field44=" + field44 + ", field45=" + field45 + ", field46=" + field46 + ", field47=" + field47
                + ", field48=" + field48 + ", field49=" + field49 + ", field50=" + field50 + ", field51=" + field51
                + ", field52=" + field52 + ", field53=" + field53 + ", field54=" + field54 + ", field55=" + field55
                + ", field56=" + field56 + ", field57=" + field57 + ", field58=" + field58 + ", field59=" + field59
                + ", field60=" + field60 + ", field61=" + field61 + ", field62=" + field62 + ", field63=" + field63
                + ", field64=" + field64 + ", field65=" + field65 + ", field66=" + field66 + ", field67=" + field67
                + ", field68=" + field68 + "]";
    }

}