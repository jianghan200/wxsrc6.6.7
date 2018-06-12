package com.tencent.mm.protocal.c;

public final class dc
  extends com.tencent.mm.bk.a
{
  public String hcr;
  public String jSv;
  public String ksA;
  public String rdf;
  public String rdg;
  public int rdh;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ksA != null) {
        paramVarArgs.g(1, this.ksA);
      }
      if (this.hcr != null) {
        paramVarArgs.g(2, this.hcr);
      }
      if (this.jSv != null) {
        paramVarArgs.g(3, this.jSv);
      }
      if (this.rdf != null) {
        paramVarArgs.g(4, this.rdf);
      }
      if (this.rdg != null) {
        paramVarArgs.g(5, this.rdg);
      }
      paramVarArgs.fT(6, this.rdh);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ksA == null) {
        break label438;
      }
    }
    label438:
    for (int i = f.a.a.b.b.a.h(1, this.ksA) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hcr != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hcr);
      }
      i = paramInt;
      if (this.jSv != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jSv);
      }
      paramInt = i;
      if (this.rdf != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rdf);
      }
      i = paramInt;
      if (this.rdg != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rdg);
      }
      return i + f.a.a.a.fQ(6, this.rdh);
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
        dc localdc = (dc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localdc.ksA = locala.vHC.readString();
          return 0;
        case 2: 
          localdc.hcr = locala.vHC.readString();
          return 0;
        case 3: 
          localdc.jSv = locala.vHC.readString();
          return 0;
        case 4: 
          localdc.rdf = locala.vHC.readString();
          return 0;
        case 5: 
          localdc.rdg = locala.vHC.readString();
          return 0;
        }
        localdc.rdh = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */