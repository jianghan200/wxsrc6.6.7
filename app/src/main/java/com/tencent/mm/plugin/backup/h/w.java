package com.tencent.mm.plugin.backup.h;

public final class w
  extends com.tencent.mm.bk.a
{
  public String ID;
  public com.tencent.mm.bk.b hbs;
  public int hcC;
  public int hcD;
  public int hcE;
  public int hcF;
  public com.tencent.mm.bk.b hcH;
  public int hcd;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new f.a.a.b("Not all required fields were included: ID");
      }
      paramVarArgs.fT(1, this.hcC);
      paramVarArgs.fT(2, this.hcd);
      if (this.ID != null) {
        paramVarArgs.g(3, this.ID);
      }
      if (this.hbs != null) {
        paramVarArgs.b(4, this.hbs);
      }
      paramVarArgs.fT(5, this.hcD);
      paramVarArgs.fT(6, this.hcE);
      paramVarArgs.fT(7, this.hcF);
      if (this.hcH != null) {
        paramVarArgs.b(8, this.hcH);
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
      i = f.a.a.a.fQ(1, this.hcC) + 0 + f.a.a.a.fQ(2, this.hcd);
      paramInt = i;
      if (this.ID != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.ID);
      }
      i = paramInt;
      if (this.hbs != null) {
        i = paramInt + f.a.a.a.a(4, this.hbs);
      }
      i = i + f.a.a.a.fQ(5, this.hcD) + f.a.a.a.fQ(6, this.hcE) + f.a.a.a.fQ(7, this.hcF);
      paramInt = i;
    } while (this.hcH == null);
    return i + f.a.a.a.a(8, this.hcH);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.ID == null) {
        throw new f.a.a.b("Not all required fields were included: ID");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      w localw = (w)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localw.hcC = locala.vHC.rY();
        return 0;
      case 2: 
        localw.hcd = locala.vHC.rY();
        return 0;
      case 3: 
        localw.ID = locala.vHC.readString();
        return 0;
      case 4: 
        localw.hbs = locala.cJR();
        return 0;
      case 5: 
        localw.hcD = locala.vHC.rY();
        return 0;
      case 6: 
        localw.hcE = locala.vHC.rY();
        return 0;
      case 7: 
        localw.hcF = locala.vHC.rY();
        return 0;
      }
      localw.hcH = locala.cJR();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/h/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */