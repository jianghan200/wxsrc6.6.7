package com.tencent.mm.protocal.c;

public final class avr
  extends com.tencent.mm.bk.a
{
  public String path;
  public String rYG;
  public String rYH;
  public int rkb;
  public int type;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.g(1, this.username);
      }
      if (this.rYG != null) {
        paramVarArgs.g(2, this.rYG);
      }
      if (this.rYH != null) {
        paramVarArgs.g(3, this.rYH);
      }
      if (this.path != null) {
        paramVarArgs.g(4, this.path);
      }
      paramVarArgs.fT(5, this.rkb);
      paramVarArgs.fT(6, this.type);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label418;
      }
    }
    label418:
    for (int i = f.a.a.b.b.a.h(1, this.username) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rYG != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rYG);
      }
      i = paramInt;
      if (this.rYH != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rYH);
      }
      paramInt = i;
      if (this.path != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.path);
      }
      return paramInt + f.a.a.a.fQ(5, this.rkb) + f.a.a.a.fQ(6, this.type);
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
        avr localavr = (avr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localavr.username = locala.vHC.readString();
          return 0;
        case 2: 
          localavr.rYG = locala.vHC.readString();
          return 0;
        case 3: 
          localavr.rYH = locala.vHC.readString();
          return 0;
        case 4: 
          localavr.path = locala.vHC.readString();
          return 0;
        case 5: 
          localavr.rkb = locala.vHC.rY();
          return 0;
        }
        localavr.type = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/avr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */