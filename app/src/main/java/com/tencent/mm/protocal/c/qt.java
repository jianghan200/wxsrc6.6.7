package com.tencent.mm.protocal.c;

public final class qt
  extends com.tencent.mm.bk.a
{
  public int eJV;
  public String eJW;
  public String eJX;
  public String eJY;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.eJV);
      if (this.eJW != null) {
        paramVarArgs.g(2, this.eJW);
      }
      if (this.eJX != null) {
        paramVarArgs.g(3, this.eJX);
      }
      if (this.eJY != null) {
        paramVarArgs.g(4, this.eJY);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.eJV) + 0;
      paramInt = i;
      if (this.eJW != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.eJW);
      }
      i = paramInt;
      if (this.eJX != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.eJX);
      }
      paramInt = i;
    } while (this.eJY == null);
    return i + f.a.a.b.b.a.h(4, this.eJY);
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
      qt localqt = (qt)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localqt.eJV = locala.vHC.rY();
        return 0;
      case 2: 
        localqt.eJW = locala.vHC.readString();
        return 0;
      case 3: 
        localqt.eJX = locala.vHC.readString();
        return 0;
      }
      localqt.eJY = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/qt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */