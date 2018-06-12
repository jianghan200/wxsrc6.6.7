package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aa
  extends bhd
{
  public String SSID;
  public String URL;
  public String qYZ;
  public String qZa;
  public String qZb;
  public int qZc;
  public LinkedList<cr> qZd = new LinkedList();
  public int qZe;
  public String qZf;
  public int qZg;
  public String qZh;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.URL != null) {
        paramVarArgs.g(2, this.URL);
      }
      if (this.SSID != null) {
        paramVarArgs.g(3, this.SSID);
      }
      if (this.qYZ != null) {
        paramVarArgs.g(4, this.qYZ);
      }
      if (this.qZa != null) {
        paramVarArgs.g(5, this.qZa);
      }
      if (this.qZb != null) {
        paramVarArgs.g(6, this.qZb);
      }
      paramVarArgs.fT(7, this.qZc);
      paramVarArgs.d(8, 8, this.qZd);
      paramVarArgs.fT(9, this.qZe);
      if (this.qZf != null) {
        paramVarArgs.g(10, this.qZf);
      }
      paramVarArgs.fT(11, this.qZg);
      if (this.qZh != null) {
        paramVarArgs.g(12, this.qZh);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label916;
      }
    }
    label916:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.URL != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.URL);
      }
      i = paramInt;
      if (this.SSID != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.SSID);
      }
      paramInt = i;
      if (this.qYZ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.qYZ);
      }
      i = paramInt;
      if (this.qZa != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.qZa);
      }
      paramInt = i;
      if (this.qZb != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.qZb);
      }
      i = paramInt + f.a.a.a.fQ(7, this.qZc) + f.a.a.a.c(8, 8, this.qZd) + f.a.a.a.fQ(9, this.qZe);
      paramInt = i;
      if (this.qZf != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.qZf);
      }
      i = paramInt + f.a.a.a.fQ(11, this.qZg);
      paramInt = i;
      if (this.qZh != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.qZh);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.qZd.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        aa localaa = (aa)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
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
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaa.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaa.URL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaa.SSID = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaa.qYZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaa.qZa = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaa.qZb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localaa.qZc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaa.qZd.add(localObject1);
            paramInt += 1;
          }
        case 9: 
          localaa.qZe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localaa.qZf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localaa.qZg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localaa.qZh = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */