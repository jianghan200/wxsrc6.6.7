package com.tencent.mm.protocal.c;

public final class vw
  extends com.tencent.mm.bk.a
{
  public int hcd;
  public String rmy;
  public int rmz;
  public String rro;
  public String rrp;
  public String rrq;
  public int rrr;
  public String rze;
  public String rzf;
  public int rzg;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rro != null) {
        paramVarArgs.g(1, this.rro);
      }
      if (this.rrp != null) {
        paramVarArgs.g(2, this.rrp);
      }
      if (this.rrq != null) {
        paramVarArgs.g(3, this.rrq);
      }
      paramVarArgs.fT(4, this.rrr);
      if (this.rze != null) {
        paramVarArgs.g(5, this.rze);
      }
      if (this.rmy != null) {
        paramVarArgs.g(6, this.rmy);
      }
      paramVarArgs.fT(7, this.rmz);
      if (this.rzf != null) {
        paramVarArgs.g(8, this.rzf);
      }
      paramVarArgs.fT(9, this.hcd);
      paramVarArgs.fT(10, this.rzg);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rro == null) {
        break label614;
      }
    }
    label614:
    for (int i = f.a.a.b.b.a.h(1, this.rro) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rrp != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rrp);
      }
      i = paramInt;
      if (this.rrq != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rrq);
      }
      i += f.a.a.a.fQ(4, this.rrr);
      paramInt = i;
      if (this.rze != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rze);
      }
      i = paramInt;
      if (this.rmy != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rmy);
      }
      i += f.a.a.a.fQ(7, this.rmz);
      paramInt = i;
      if (this.rzf != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rzf);
      }
      return paramInt + f.a.a.a.fQ(9, this.hcd) + f.a.a.a.fQ(10, this.rzg);
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
        vw localvw = (vw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localvw.rro = locala.vHC.readString();
          return 0;
        case 2: 
          localvw.rrp = locala.vHC.readString();
          return 0;
        case 3: 
          localvw.rrq = locala.vHC.readString();
          return 0;
        case 4: 
          localvw.rrr = locala.vHC.rY();
          return 0;
        case 5: 
          localvw.rze = locala.vHC.readString();
          return 0;
        case 6: 
          localvw.rmy = locala.vHC.readString();
          return 0;
        case 7: 
          localvw.rmz = locala.vHC.rY();
          return 0;
        case 8: 
          localvw.rzf = locala.vHC.readString();
          return 0;
        case 9: 
          localvw.hcd = locala.vHC.rY();
          return 0;
        }
        localvw.rzg = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/vw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */