package com.tencent.mm.protocal.c;

public final class bbb
  extends com.tencent.mm.bk.a
{
  public String eJJ;
  public String eJQ;
  public String rPL;
  public float rmr;
  public float rms;
  public String sdn;
  public String sdo;
  public long sdp;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sdn != null) {
        paramVarArgs.g(1, this.sdn);
      }
      if (this.eJQ != null) {
        paramVarArgs.g(2, this.eJQ);
      }
      if (this.eJJ != null) {
        paramVarArgs.g(3, this.eJJ);
      }
      if (this.rPL != null) {
        paramVarArgs.g(4, this.rPL);
      }
      paramVarArgs.l(5, this.rms);
      paramVarArgs.l(6, this.rmr);
      if (this.sdo != null) {
        paramVarArgs.g(7, this.sdo);
      }
      paramVarArgs.T(8, this.sdp);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sdn == null) {
        break label512;
      }
    }
    label512:
    for (int i = f.a.a.b.b.a.h(1, this.sdn) + 0;; i = 0)
    {
      paramInt = i;
      if (this.eJQ != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.eJQ);
      }
      i = paramInt;
      if (this.eJJ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.eJJ);
      }
      paramInt = i;
      if (this.rPL != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rPL);
      }
      i = paramInt + (f.a.a.b.b.a.ec(5) + 4) + (f.a.a.b.b.a.ec(6) + 4);
      paramInt = i;
      if (this.sdo != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.sdo);
      }
      return paramInt + f.a.a.a.S(8, this.sdp);
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
        bbb localbbb = (bbb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbbb.sdn = locala.vHC.readString();
          return 0;
        case 2: 
          localbbb.eJQ = locala.vHC.readString();
          return 0;
        case 3: 
          localbbb.eJJ = locala.vHC.readString();
          return 0;
        case 4: 
          localbbb.rPL = locala.vHC.readString();
          return 0;
        case 5: 
          localbbb.rms = locala.vHC.readFloat();
          return 0;
        case 6: 
          localbbb.rmr = locala.vHC.readFloat();
          return 0;
        case 7: 
          localbbb.sdo = locala.vHC.readString();
          return 0;
        }
        localbbb.sdp = locala.vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */