package com.tencent.mm.protocal.c;

public class lk
  extends com.tencent.mm.bk.a
{
  public String huX;
  public String hyz;
  public String lMY;
  public String rnv;
  public String rnw;
  public long roL;
  public String roM;
  public String roN;
  public String title;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.g(1, this.title);
      }
      if (this.huX != null) {
        paramVarArgs.g(2, this.huX);
      }
      if (this.hyz != null) {
        paramVarArgs.g(3, this.hyz);
      }
      if (this.url != null) {
        paramVarArgs.g(4, this.url);
      }
      paramVarArgs.T(5, this.roL);
      if (this.roM != null) {
        paramVarArgs.g(6, this.roM);
      }
      if (this.roN != null) {
        paramVarArgs.g(7, this.roN);
      }
      if (this.lMY != null) {
        paramVarArgs.g(8, this.lMY);
      }
      if (this.rnv != null) {
        paramVarArgs.g(9, this.rnv);
      }
      if (this.rnw != null) {
        paramVarArgs.g(10, this.rnw);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label666;
      }
    }
    label666:
    for (int i = f.a.a.b.b.a.h(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.huX != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.huX);
      }
      i = paramInt;
      if (this.hyz != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hyz);
      }
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.url);
      }
      i = paramInt + f.a.a.a.S(5, this.roL);
      paramInt = i;
      if (this.roM != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.roM);
      }
      i = paramInt;
      if (this.roN != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.roN);
      }
      paramInt = i;
      if (this.lMY != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.lMY);
      }
      i = paramInt;
      if (this.rnv != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rnv);
      }
      paramInt = i;
      if (this.rnw != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rnw);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        lk locallk = (lk)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          locallk.title = locala.vHC.readString();
          return 0;
        case 2: 
          locallk.huX = locala.vHC.readString();
          return 0;
        case 3: 
          locallk.hyz = locala.vHC.readString();
          return 0;
        case 4: 
          locallk.url = locala.vHC.readString();
          return 0;
        case 5: 
          locallk.roL = locala.vHC.rZ();
          return 0;
        case 6: 
          locallk.roM = locala.vHC.readString();
          return 0;
        case 7: 
          locallk.roN = locala.vHC.readString();
          return 0;
        case 8: 
          locallk.lMY = locala.vHC.readString();
          return 0;
        case 9: 
          locallk.rnv = locala.vHC.readString();
          return 0;
        }
        locallk.rnw = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/lk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */