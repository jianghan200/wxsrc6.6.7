package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bku
  extends com.tencent.mm.bk.a
{
  public String bKg;
  public int dwI;
  public int dwJ;
  public String dwK;
  public int emx;
  public int enM;
  public String nuY;
  public LinkedList<btc> ske = new LinkedList();
  public int skf;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.nuY == null) {
        throw new b("Not all required fields were included: clientID");
      }
      paramVarArgs.d(1, 8, this.ske);
      if (this.nuY != null) {
        paramVarArgs.g(2, this.nuY);
      }
      if (this.bKg != null) {
        paramVarArgs.g(3, this.bKg);
      }
      if (this.dwK != null) {
        paramVarArgs.g(4, this.dwK);
      }
      if (this.url != null) {
        paramVarArgs.g(5, this.url);
      }
      paramVarArgs.fT(6, this.enM);
      paramVarArgs.fT(7, this.emx);
      paramVarArgs.fT(8, this.skf);
      paramVarArgs.fT(9, this.dwI);
      paramVarArgs.fT(10, this.dwJ);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.c(1, 8, this.ske) + 0;
      paramInt = i;
      if (this.nuY != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.nuY);
      }
      i = paramInt;
      if (this.bKg != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bKg);
      }
      paramInt = i;
      if (this.dwK != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.dwK);
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.url);
      }
      return i + f.a.a.a.fQ(6, this.enM) + f.a.a.a.fQ(7, this.emx) + f.a.a.a.fQ(8, this.skf) + f.a.a.a.fQ(9, this.dwI) + f.a.a.a.fQ(10, this.dwJ);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ske.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.nuY == null) {
        throw new b("Not all required fields were included: clientID");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      bku localbku = (bku)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new btc();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((btc)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbku.ske.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 2: 
        localbku.nuY = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        localbku.bKg = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 4: 
        localbku.dwK = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 5: 
        localbku.url = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 6: 
        localbku.enM = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 7: 
        localbku.emx = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 8: 
        localbku.skf = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 9: 
        localbku.dwI = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localbku.dwJ = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */