package com.tencent.mm.protocal.c;

public final class kd
  extends com.tencent.mm.bk.a
{
  public String bWP;
  public String poH;
  public String pwk;
  public String rlM;
  public String rlN;
  public int rlO;
  public String title;
  public int type;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.type);
      if (this.pwk != null) {
        paramVarArgs.g(2, this.pwk);
      }
      if (this.bWP != null) {
        paramVarArgs.g(3, this.bWP);
      }
      if (this.title != null) {
        paramVarArgs.g(4, this.title);
      }
      if (this.poH != null) {
        paramVarArgs.g(5, this.poH);
      }
      if (this.url != null) {
        paramVarArgs.g(6, this.url);
      }
      if (this.rlM != null) {
        paramVarArgs.g(7, this.rlM);
      }
      if (this.rlN != null) {
        paramVarArgs.g(8, this.rlN);
      }
      paramVarArgs.fT(9, this.rlO);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.type) + 0;
      paramInt = i;
      if (this.pwk != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.pwk);
      }
      i = paramInt;
      if (this.bWP != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bWP);
      }
      paramInt = i;
      if (this.title != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.title);
      }
      i = paramInt;
      if (this.poH != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.poH);
      }
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.url);
      }
      i = paramInt;
      if (this.rlM != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rlM);
      }
      paramInt = i;
      if (this.rlN != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rlN);
      }
      return paramInt + f.a.a.a.fQ(9, this.rlO);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      kd localkd = (kd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localkd.type = locala.vHC.rY();
        return 0;
      case 2: 
        localkd.pwk = locala.vHC.readString();
        return 0;
      case 3: 
        localkd.bWP = locala.vHC.readString();
        return 0;
      case 4: 
        localkd.title = locala.vHC.readString();
        return 0;
      case 5: 
        localkd.poH = locala.vHC.readString();
        return 0;
      case 6: 
        localkd.url = locala.vHC.readString();
        return 0;
      case 7: 
        localkd.rlM = locala.vHC.readString();
        return 0;
      case 8: 
        localkd.rlN = locala.vHC.readString();
        return 0;
      }
      localkd.rlO = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/kd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */