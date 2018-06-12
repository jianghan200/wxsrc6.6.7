package com.tencent.mm.protocal.c;

public final class cbf
  extends com.tencent.mm.bk.a
{
  public String sxq;
  public String sxr;
  public String sxs;
  public String sxt;
  public int sxu;
  public float sxv;
  public float sxw;
  public String sxx;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sxq != null) {
        paramVarArgs.g(1, this.sxq);
      }
      if (this.sxr != null) {
        paramVarArgs.g(2, this.sxr);
      }
      if (this.sxs != null) {
        paramVarArgs.g(3, this.sxs);
      }
      if (this.sxt != null) {
        paramVarArgs.g(4, this.sxt);
      }
      paramVarArgs.fT(5, this.sxu);
      paramVarArgs.l(6, this.sxv);
      paramVarArgs.l(7, this.sxw);
      if (this.sxx != null) {
        paramVarArgs.g(8, this.sxx);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.sxq == null) {
        break label512;
      }
    }
    label512:
    for (int i = f.a.a.b.b.a.h(1, this.sxq) + 0;; i = 0)
    {
      paramInt = i;
      if (this.sxr != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.sxr);
      }
      i = paramInt;
      if (this.sxs != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sxs);
      }
      paramInt = i;
      if (this.sxt != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sxt);
      }
      i = paramInt + f.a.a.a.fQ(5, this.sxu) + (f.a.a.b.b.a.ec(6) + 4) + (f.a.a.b.b.a.ec(7) + 4);
      paramInt = i;
      if (this.sxx != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.sxx);
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
        cbf localcbf = (cbf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcbf.sxq = locala.vHC.readString();
          return 0;
        case 2: 
          localcbf.sxr = locala.vHC.readString();
          return 0;
        case 3: 
          localcbf.sxs = locala.vHC.readString();
          return 0;
        case 4: 
          localcbf.sxt = locala.vHC.readString();
          return 0;
        case 5: 
          localcbf.sxu = locala.vHC.rY();
          return 0;
        case 6: 
          localcbf.sxv = locala.vHC.readFloat();
          return 0;
        case 7: 
          localcbf.sxw = locala.vHC.readFloat();
          return 0;
        }
        localcbf.sxx = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/cbf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */